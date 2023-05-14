package step_add_to_cart;
import demoblazePage.AddToCart;
import demoblazePage.HomePage;
import demoblazePage.LoginDemoblaze;
import demoblazePage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AddToCartScenarioSteps extends ScenarioSteps {
	AddToCart add = new AddToCart(getDriver());
	
	@Step
	public void open_page() {
		add.open();
	}

	@Step
	public void click_type_and_product(String type, String product) throws InterruptedException {
		add.chooseTypeAndProduct(type, product);
	}

	@Step
	public void click_add_to_cart() {
		 add.clickaddToCart();
	}

	@Step
	public void click_cart_button () {
		add.clickCart();
	}
	
	@Step
	public String get_title() {
		return add.getTitle();
	}
	
	@Step
	public String get_price() {
		return add.getPrice();
	}
	
	
}