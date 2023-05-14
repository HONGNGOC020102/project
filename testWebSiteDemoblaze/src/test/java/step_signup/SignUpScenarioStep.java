package step_signup;

import demoblazePage.HomePage;
import demoblazePage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SignUpScenarioStep extends ScenarioSteps {
	SignupDemoblaze signUp = new SignupDemoblaze(getDriver());
	
	@Step
	public void open_page() {
		signUp.open();
	}

	@Step
	public void click_signup_Button_homePage() {
		signUp.clickSignupHomePageButton();
	}
	@Step
	public void sign_up_with_user_pass(String user, String pass) throws InterruptedException {
		signUp.signUpWithUserPass(user, pass);
	}

	
	@Step
	public void click_sign_up() throws InterruptedException {
		signUp.clickSignupButton();
		Thread.sleep(3000);
	}
	
	@Step
	public void click_close() {
		signUp.clickClose();
	}
}