package step_logout;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutSteps {
	@Steps
	private LogoutScenarioSteps logoutStep;

	@Before
	public void fullScreen() {
		logoutStep.getDriver().manage().window().maximize();
	}

	@Given("Access home page")
	public void accessHomePage() {
		logoutStep.open_page();
	}

	@When("Click login button")
	public void clickLoginButton() {
		logoutStep.click_login_Button_homePage();
	}

	@And("Login with input {string} and {string}")
	public void logInDemo(String user, String pass) throws InterruptedException {
		logoutStep.log_in_with_user_pass(user, pass);
		Thread.sleep(3000);
	}
	
	@And("Click logout")
	public void clickLogout()  {
		logoutStep.click_logout();
	}

	@Then("Confirm logout cuccess")
	public void confirmLogoutSuccess() {
		assertEquals(logoutStep.getDriver().getCurrentUrl(), "https://www.demoblaze.com/index.html");
	}

	
//	assertEquals(driver.switchTo().alert().getText(), "Product added.");
//	driver.switchTo().alert().accept();

}
