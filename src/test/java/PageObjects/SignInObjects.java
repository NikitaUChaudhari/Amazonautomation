package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInObjects {

	WebDriver driver;

	@FindBy(id = "nav-link-accountList-nav-line-1")
	WebElement hoverArrow;

	@FindBy(xpath = "//span[@class='nav-action-inner']")
	WebElement signInButton;

	@FindBy(xpath = "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")
	WebElement email;

	@FindBy(id = "continue")
	WebElement continues;

	@FindBy(id = "createAccountSubmit")
	WebElement createAccount;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement loginButton;
	
	@FindBy(id="nav-item-signout")
	WebElement signOut;

	public SignInObjects(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(d, this);
	}

	public void hoverSign() {
		Actions action = new Actions(driver);
		action.moveToElement(hoverArrow).perform();
	}

	public void clickSign() {
		signInButton.click();
	}

	public void setUsername(String uname) {
		email.sendKeys(uname);
	}
	
	public void clickContinue() {
		continues.click();
	}
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void logIn() {
		loginButton.click();
	}
	
	public void logOut() {
		signOut.click();
	}

}
