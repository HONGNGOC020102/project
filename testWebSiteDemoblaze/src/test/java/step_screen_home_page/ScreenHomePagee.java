package step_screen_home_page;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ScreenHomePagee {

	
	@Steps
	private HomePageScenarioSteps screenHomeStep;
	
	@Before
	public void fullScreen() {
		screenHomeStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access web page")
	public void accessWebPage() {
		screenHomeStep.open_page();
	}
	
	@When("Clicking Home button")
	public void homeButton() {
		screenHomeStep.click_button_home();
	}

	@Then("Display Home page")
	public void checkHomeButton() {
			assertEquals(screenHomeStep.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
	}
	
	@When("Clicking Contact button")
	public void contactButton() throws InterruptedException {
		screenHomeStep.click_button_contact();
	}
	
	@Then("Display new message dialog {string}")
	public void checkContactButton(String exampleModalLabel) {
			assertEquals(screenHomeStep.get_example_modal_label(), exampleModalLabel);
	}
	
	@When("Clicking AboutUs button")
	public void aboutUsButton() throws InterruptedException {
		screenHomeStep.click_button_aboutus();
	}
	
	@Then("Display about us popup {string}")
	public void checkAboutUsButton(String videoModalLabel) {
			assertEquals(screenHomeStep.get_video_modal_label(), videoModalLabel);
	}
	
	@When("Clicking cart button")
	public void cartButton() throws InterruptedException {
		screenHomeStep.click_button_cart();
	}
	
	@Then("Display cart page")
	public void checkCartButton() {
		assertEquals(screenHomeStep.getDriver().getCurrentUrl(), "https://www.demoblaze.com/cart.html");
	}
	
	@When("Clicking login button")
	public void loginButton() throws InterruptedException {
		screenHomeStep.click_button_login();
	}
	
	@Then("Display login dialog {string}")
	public void checkLoginButton(String logInModalLabel) {
			assertEquals(screenHomeStep.get_login_modal_label(), logInModalLabel);
	}
	
	@When("Clicking Sign up button")
	public void signUpButton() throws InterruptedException {
		screenHomeStep.click_button_signup();
	}
	
	@Then("Display Sign up dialog {string}")
	public void checkSignUpButton(String signInModalLabel) {
			assertEquals(screenHomeStep.get_sign_in_modal_label(), signInModalLabel);
	}
	
	@When("Choose {string} and {string}")
	public void chooseTypeAndProduct(String type, String product) throws InterruptedException {
		screenHomeStep.click_type_product(type, product);
	}
	
	@Then("Verify {string} title product {string}")
	public void checkPhonesButton(String product, String titleproduct) throws InterruptedException {
		assertEquals(screenHomeStep.get_title_product(product), titleproduct);
	}
	
	@Then("Display footer tittle {string}")
	public void checkHomeButton(String tittle) {
			assertEquals(screenHomeStep.get_tittle_footer(), tittle);
	}
	
	
//	pop up
//	assertEquals(driver.switchTo().alert().getText(), "Product added.");
//	driver.switchTo().alert().accept();
	
}
