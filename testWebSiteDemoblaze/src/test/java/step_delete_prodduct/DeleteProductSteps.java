package step_delete_prodduct;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DeleteProductSteps {
	@Steps
	private DeleteProductScenarioSteps deleteStep;
	
	@Before
	public void fullScreen() {
		deleteStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		deleteStep.open_page();
	}
	@When("Choose {string} {string} to cart")
	public void clickTypeAndProduct(String type, String product) throws InterruptedException {
		deleteStep.click_type_and_product(type, product);
		deleteStep.click_add_to_cart();
		Thread.sleep(3000);
		deleteStep.getDriver().switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	@And ("Click cart and delete product")
	public void click_add_to_cart() throws InterruptedException {
		deleteStep.click_cart_button();
		Thread.sleep(3000);
		deleteStep.click_delete();
		Thread.sleep(3000);
	}
	
	@Then ("Confirm delete success")
	public void confirmProduct(){
		assertEquals(deleteStep.getDriver().getCurrentUrl(), "https://www.demoblaze.com/cart.html#" );
	}
	
	
//	assertEquals(driver.switchTo().alert().getText(), "Product added.");
//	driver.switchTo().alert().accept();

}
