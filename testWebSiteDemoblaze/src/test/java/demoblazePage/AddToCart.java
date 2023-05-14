package demoblazePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class AddToCart extends PageObject {
	private WebDriver driver= getDriver();
	
	@FindBy(xpath  = "//a[@id='cartur']")
	WebElement cart_button;
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addtocart_button;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	WebElement title_product_inCart;
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]")
	WebElement price_product_incart;
	WebElement type_product_button;
	WebElement product_button;
	
	public AddToCart(WebDriver driver) {
		this.driver = driver;
	}
	
	public void chooseTypeAndProduct (String type, String product ) throws InterruptedException {
		type_product_button= find(By.xpath("//a[contains(text(),'"+type+"')]"));
		type_product_button.click();
		product_button= find(By.xpath("//a[contains(text(),'"+ product + "')]"));
		product_button.click();
		Thread.sleep(4000);
	}
	
	public void clickCart() {
		cart_button.click();
	}
	
	public void clickaddToCart() {
		addtocart_button.click();
	}
	
	public String getTitle() {
		return title_product_inCart.getText();
	}
	
	public String getPrice() {
		return price_product_incart.getText();
	}
}