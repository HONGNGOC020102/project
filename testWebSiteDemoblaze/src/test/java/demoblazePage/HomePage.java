package demoblazePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class HomePage extends PageObject {
	
	private WebDriver driver;
	@FindBy(xpath = "/html/body/nav/div[1]/ul/li[1]/a")
	WebElement button_home;
	@FindBy(xpath = "/html/body/nav/div[1]/ul/li[2]/a")
	WebElement button_contact;
	@FindBy(xpath = "/html/body/nav/div[1]/ul/li[3]/a")
	WebElement button_AboutUs;
	@FindBy(xpath = "/html/body/nav/div[1]/ul/li[4]/a")
	WebElement button_cart;
	@FindBy(id = "login2")
	WebElement button_login;
	@FindBy(id = "signin2")
	WebElement button_signUp;
//	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[2]")
//	WebElement button_phones;
//	@FindBy(xpath = "#tbodyid")
//	WebElement product_list_phones;
//	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[3]")
//	WebElement button_laptops;
//	@FindBy(xpath = "/html/body/div[5]/div/div[2]/div")
//	WebElement product_laptops;
//	@FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[4]")
//	WebElement button_monitors;
//	@FindBy(xpath = "//a[contains(text(),'Apple monitor 24')]")
	WebElement product_monotors;
	@FindBy(id = "exampleModalLabel")
	WebElement exampleModalLabel;
	@FindBy(id = "videoModalLabel")
	WebElement videoModalLabel;
	@FindBy(id = "logInModalLabel")
	WebElement logInModalLabel;
	@FindBy(id = "signInModalLabel")
	WebElement signInModalLabel;
	
	@FindBy(xpath = "//b[contains(text(),'About Us')]")
	WebElement tittle_footer;
	
	WebElement tittle_product;
	
	WebElement type_product_button;
	WebElement product_button;
	List<WebElement> product;

	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

//
	
	public int getProduct() {
		product = driver.findElements(By.id("tbodyid"));
		return product.size();
	}
	
	public void clickTypeProduct(String type, String product) throws InterruptedException {
		type_product_button= find(By.xpath("//a[contains(text(),'"+type+"')]"));
		type_product_button.click();
		product_button= find(By.xpath("//a[contains(text(),'"+ product + "')]"));
		product_button.click();
		Thread.sleep(4000);
	}
	
	public String getTitleProduct(String product) {
		tittle_product= find(By.xpath("//h2[contains(text(),'"+product+"')]"));
		return tittle_product.getText();
	}
	
	
	public void clickHomeButton() { button_home.click();
	}
	
	public void clickContactButton() {button_contact.click();
	}
	
	public void clickAboutUsButton() {button_AboutUs.click();
	}
	
	public void clickCartButton() {button_cart.click();
	}
	
	public void clickLoginButton() {button_login.click();
	}
	
	public void clickSignupButton() {button_signUp.click();
	}
	
	public String getExampleModalLabel() {return exampleModalLabel.getText();
	}
	
	public String getVideoModalLabel() {return videoModalLabel.getText();
	}
	public String getLogInModalLabel() {return logInModalLabel.getText();
	}
	
	public String getSignInModalLabel() {return signInModalLabel.getText();
	}
	
	public String getTittleFooter() {return tittle_footer.getText();
	}
	
}
