package step_add_to_cart;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartSteps {
	@Steps
	private AddToCartScenarioSteps addStep;
	
	@Before
	public void fullScreen() {
		addStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		addStep.open_page();
	}
	
	@When("Choose {string} {string} to cart")
	public void clickTypeAndProduct(String type, String product) throws InterruptedException {
		addStep.click_type_and_product(type, product);
		addStep.click_add_to_cart();
		Thread.sleep(3000);
	}
	
	@Then ("Confirm product added {string}")
	public void confirmProduct(String message){
		assertEquals(addStep.getDriver().switchTo().alert().getText(), message );
		addStep.getDriver().switchTo().alert().accept();
	}
	
	@And ("Click cart button")
	public void click_cart() throws InterruptedException {
		addStep.getDriver().switchTo().alert().accept();
		Thread.sleep(3000);
		addStep.click_cart_button();
		Thread.sleep(3000);
	}
	
	@Then("Confirm title {string}")
	public void confirmTitle( String title) {
		assertEquals(addStep.get_title(), title);
	}
	
	@Then("Confirm price {string}")
	public void confirmPrice(String price) {
		assertEquals(addStep.get_price(), price);
	}

//	assertEquals(driver.switchTo().alert().getText(), "Product added.");
//	driver.switchTo().alert().accept();

}
