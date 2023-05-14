package step_logout;
import demoblazePage.HomePage;
import demoblazePage.LoginDemoblaze;
import demoblazePage.Logout;
import demoblazePage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LogoutScenarioSteps extends ScenarioSteps {
	Logout logout = new Logout(getDriver());
	
	@Step
	public void open_page() {
		logout.open();
	}

	@Step
	public void click_login_Button_homePage() {
		logout.clickloginButtonHomePage();
	}
	@Step
	public void log_in_with_user_pass(String user, String pass) throws InterruptedException {
		logout.loginWithUserPass(user, pass);
	}
	
	@Step
	public void click_log_in() {
		logout.clickLoginButton();
	}
	
	@Step
	public void click_logout() {
		logout.clickLogout();
	}
	
	
}