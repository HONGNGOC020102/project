package step_place_order;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PlaceOrderSteps {
	@Steps
	private PlaceOrderScenarioSteps order;
	
	@Before
	public void fullScreen() {
		order.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		order.open_page();
	}
	
	@When("choose {string} {string} to cart and click place order")
	public void clickTypeAndProduct(String type, String product) throws InterruptedException {
		order.click_type_and_product(type, product);
		order.click_add_to_cart();
		Thread.sleep(3000);
		order.getDriver().switchTo().alert().accept();
		order.click_cart_button();
		Thread.sleep(3000);
		order.click_place_order_button();
	}

	@Then ("Confirm place order {string}")
	public void confirmClickPlaceOrder(String title){
		assertEquals(order.get_title(), title );
	}
	
	@Then("Confirm total {string}")
	public void confirmTotal(String total) {
		assertEquals(order.get_total(), total);
	}
	
	@And ("fill in {string} {string} infomation and click purchase")
	public void info_to_purchase(String name, String card) throws InterruptedException {
		order.input_info_place_order(name, card);
		Thread.sleep(4000);
		order.click_purchase();
		Thread.sleep(4000);
	}
	
	@Then("Confirm purchase {string}")
	public void confirmPurchase(String message) {
		assertEquals(order.get_purchase_cuccess(), message);
	}
	
	@Then("Confirm message {string}")
	public void confirmMessage(String errorMessage) {
		assertEquals(order.getDriver().switchTo().alert().getText(), errorMessage);
	}
	
	@And("click ok")
	public void clickOk() {
		order.click_ok();
	}
	
	@Then("Confirm url")
	public void confirmURL() {
		assertEquals(order.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
	}

}

