package step_place_order;

import demoblazePage.AddToCart;
import demoblazePage.HomePage;
import demoblazePage.LoginDemoblaze;
import demoblazePage.PlaceOrder;
import demoblazePage.SignupDemoblaze;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class PlaceOrderScenarioSteps extends ScenarioSteps {
	PlaceOrder order = new PlaceOrder(getDriver());
	
	@Step
	public void open_page() {
		order.open();
	}

	@Step
	public void click_type_and_product(String type, String product) throws InterruptedException {
		order.chooseTypeAndProduct(type, product);
	}

	@Step
	public void click_add_to_cart() {
		 order.clickaddToCart();
	}

	@Step
	public void click_cart_button () {
		order.clickCart();
	}
	

	@Step
	public void click_place_order_button() {
		 order.clickOrderPlaceButton();
	}
	@Step
	public void click_purchase() {
		order.clickPurchase();
	}
	
	@Step
	public void input_info_place_order(String name, String card) throws InterruptedException {
		order.inputInfoPlaceOrder(name, card);
	}
	
	@Step
	public void click_close() {
		order.clickClose();
	}
	
	@Step
	public String get_total() {
		return order.getTotal();
	}
	
	@Step
	public String get_title() {
		return order.getTitle();
	}
	
	@Step
	public String get_purchase_cuccess() {
		return order.getPurchaseCuccess();
	}
	
	@Step
	public void click_ok() {
		order.clickOk();
	}

	
}