package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Login extends Base{

	
	@FindBy(id = "com.bb.imsh:id/email_edittext")
	WebElement username;
	
	@FindBy(id = "com.bb.imsh:id/password_editText")
	WebElement password;
	
	@FindBy(id = "com.bb.imsh:id/sign_in_button")
	WebElement loginBtn;
	
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * Login method
	 */
	
	public void loginToApp(){
		username.sendKeys("abhishek.chandel@bizbrolly.com"+"\n");
		password.sendKeys("123456"+"\n");
		loginBtn.click();
	}
	
}
