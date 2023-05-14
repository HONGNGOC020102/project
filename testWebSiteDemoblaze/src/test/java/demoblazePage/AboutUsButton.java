package demoblazePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com/index.html")
public class AboutUsButton extends PageObject {
	private WebDriver driver;
	
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]")
	WebElement play_video;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[3]/button[1]")
	WebElement close_button;
	@FindBy(xpath = "/html[1]/body[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
	WebElement aboutus_button;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div[2]/form/div/div/div[4]/button[1]")
	WebElement pause_button;
	
	public AboutUsButton(WebDriver driver) {
		this.driver = driver;
//		blob:https://www.demoblaze.com/a0bbc108-ddec-4205-9209-36adff4f603e
	}
	
	public void clickplayVideo() {
		play_video.click();
	}
	public void clickClose() {
		close_button.click();
	}
	public void clickAboutUsButton() {
		aboutus_button.click();
	}
	
	public String getPauseButton() {
		return pause_button.getText();
	}
}
	
