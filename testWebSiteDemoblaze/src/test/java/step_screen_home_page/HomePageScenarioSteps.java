package step_screen_home_page;

import org.openqa.selenium.WebElement;

import demoblazePage.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class HomePageScenarioSteps extends ScenarioSteps {
	HomePage homePage = new HomePage(getDriver());
	
	@Step
	public void open_page() {
		homePage.open();
	}
	
	@Step
	public void click_button_home() {
		 homePage.clickHomeButton();
	}
	
	@Step
	public void click_button_contact() throws InterruptedException {
		 homePage.clickContactButton();
		 Thread.sleep(3000);
	}
	

	@Step
	public String get_example_modal_label() {
		return homePage.getExampleModalLabel();
	}
	
	
	@Step
	public void click_button_aboutus() throws InterruptedException {
		 homePage.clickAboutUsButton();
		 Thread.sleep(3000);
	}
	
	@Step
	public String get_video_modal_label() {
		return homePage.getVideoModalLabel();
	}
	
	
	@Step
	public void click_button_cart() throws InterruptedException {
		 homePage.clickCartButton();
		 Thread.sleep(3000);
	}
	
	@Step
	public void click_button_login() throws InterruptedException {
		 homePage.clickLoginButton();
		 Thread.sleep(3000);
	}
	
	@Step
	public String get_login_modal_label() {
		return homePage.getLogInModalLabel();
	}
	
	@Step
	public void click_button_signup() throws InterruptedException {
		 homePage.clickSignupButton();
		 Thread.sleep(3000);
	}
	
	@Step
	public String get_sign_in_modal_label() {
		return homePage.getSignInModalLabel();
	}

	@Step
	public void click_type_product(String type, String product) throws InterruptedException {
		 homePage.clickTypeProduct(type, product);
		 Thread.sleep(3000);
	}

	@Step
	public String get_title_product(String product) {
		 return homePage.getTitleProduct(product);
	}
	
	@Step
	public String get_tittle_footer() {
		 return homePage.getTittleFooter();
	}
	
	
	

	
}