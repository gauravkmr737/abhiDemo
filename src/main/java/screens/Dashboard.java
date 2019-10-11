package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Dashboard extends Base {

	
	@FindBy(className = "android.widget.ImageButton")
	WebElement menuIcon;
	
	@FindBy(id = "com.bb.imsh:id/cart_img")
	WebElement cartIcon;
	
	public Dashboard() {
		PageFactory.initElements(driver, this);
	}
	
	
	/*
	 * Click on cart button
	 */
	
	public void clickOnCart(){
		cartIcon.click();
	}
	
	public void clickOnMenu(){
		menuIcon.click();
	}
}
