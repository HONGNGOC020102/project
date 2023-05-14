package step_contact;

import demoblazePage.ContactButton;
import demoblazePage.HomePage;
import demoblazePage.LoginDemoblaze;
import demoblazePage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactScenarioSteps extends ScenarioSteps {
	ContactButton contact = new ContactButton(getDriver());
	
	@Step
	public void open_page() {
		contact.open();
	}

	@Step
	public void click_contact_button() {
		contact.clickContactButton();
	}
	@Step
	public void send_message(String email, String name, String message) throws InterruptedException {
		contact.sendMessage(email, name, message);
	}

//	@Step
//	public String get_name_of_user() {
//		return login.getNameOfUser();
//	}
	
//	@Step
//	public void click_log_in() {
//		login.clickLoginButton();
//	}
//	
	@Step
	public void click_close() {
		contact.clickClose();
	}
	
	
}