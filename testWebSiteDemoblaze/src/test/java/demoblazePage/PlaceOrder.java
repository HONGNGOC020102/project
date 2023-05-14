package demoblazePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class PlaceOrder extends PageObject {
	private WebDriver driver = getDriver();
	
	@FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	WebElement cart_button;
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addtocart_button;
	@FindBy(id = "orderModalLabel")
	WebElement title_place_order;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/form[1]/label[1]")
	WebElement total_product_inPlaceOrder;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[2]/button[1]")
	WebElement place_order_button;
	@FindBy(id = "name")
	WebElement textbox_name;
	@FindBy(id = "card")
	WebElement textbox_credit_card;
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[2]")
	WebElement purchase_button;
	@FindBy(xpath ="/html[1]/body[1]/div[3]/div[1]/div[1]/div[3]/button[1]")
	WebElement close_button;
	@FindBy(xpath ="/html[1]/body[1]/div[10]/h2[1]")
	WebElement purchase_cuccess;
	@FindBy(xpath ="//button[contains(text(),'OK')]")
	WebElement ok_button;
	WebElement type_product_button;
	WebElement product_button;
	
	public PlaceOrder(WebDriver driver) {
		this.driver = driver;
	}
	
	public void chooseTypeAndProduct (String type, String product ) throws InterruptedException {
		type_product_button= find(By.xpath("//a[contains(text(),'"+type+"')]"));
		type_product_button.click();
		product_button= find(By.xpath("//a[contains(text(),'"+ product + "')]"));
		product_button.click();
		Thread.sleep(4000);
	}
	
	public void inputInfoPlaceOrder(String name, String card) {
		textbox_name.sendKeys(name);
		textbox_credit_card.sendKeys(card);
	}
	
	public void clickPurchase() {
		purchase_button.click();
	}
	
	public void clickOrderPlaceButton() {
		place_order_button.click();
	}
	
	public void clickCart() {
		cart_button.click();
	}
	
	public void clickaddToCart() {
		addtocart_button.click();
	}
	
	public void clickClose() {
		close_button.click();
	}
	
	public void clickOk() {
		ok_button.click();
	}
	
	public String getTotal() {
		return total_product_inPlaceOrder.getText();
		
	}
	public String getTitle() {
		return title_place_order.getText();
		
	}
	
	public String getPurchaseCuccess() {
		return purchase_cuccess.getText();
		
	}
	
	
}
