package step_signup;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUp {
	@Steps
	private SignUpScenarioStep signUpStep;
	
	@Before
	public void fullScreen() {
		signUpStep.getDriver().manage().window().maximize();
	}
	
	@Given("Access home page")
	public void accessHomePage() {
		signUpStep.open_page();
	}
	
	@When("Click signup button")
	public void clickSignupButton() {
		signUpStep.click_signup_Button_homePage();
	}
	
	@And ("Signup with input {string} and {string}")
	public void signUpDemo(String user, String pass) throws InterruptedException {
		signUpStep.sign_up_with_user_pass(user, pass);
	}
	
	@Then("Display error message {string}")
	public void confirmMessage(String errorMessage) throws InterruptedException {
		assertEquals(signUpStep.getDriver().switchTo().alert().getText(), errorMessage);
		Thread.sleep(3000);
	}
	
	@When ("Click signup button then click close button")
	public void clickButton()  {
		signUpStep.click_signup_Button_homePage();
		signUpStep.click_close();
	}
	
	@Then("Confirm go to back homepage")
	public void confirmGoBackHomePage() {
		assertEquals(signUpStep.getDriver().getCurrentUrl(),"https://www.demoblaze.com/index.html");
	}
	
//	assertEquals(driver.switchTo().alert().getText(), "Product added.");
//	driver.switchTo().alert().accept();

}
