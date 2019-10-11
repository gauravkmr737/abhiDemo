package screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class SideBar extends Base{

	
	@FindBy(id = "com.bb.imsh:id/linearLayout2")
	WebElement home;
	
	@FindBy(id = "com.bb.imsh:id/my_order_tex")
	WebElement myCart;
	
	@FindBy(id = "com.bb.imsh:id/my_order_text")
	WebElement myOrders;
	
	@FindBy(id = "com.bb.imsh:id/my_Add_text")
	WebElement myAddress;
	
	@FindBy(id = "com.bb.imsh:id/change_password_text")
	WebElement changePassword;
	
	@FindBy(id = "com.bb.imsh:id/privacy_policy_layout")
	WebElement privacyPolicy;
	
	@FindBy(id = "com.bb.imsh:id/terms_layout")
	WebElement termsConditions;
	
	@FindBy(id = "com.bb.imsh:id/logout_layout")
	WebElement logoutBtn;
	
	
	public SideBar() {
		PageFactory.initElements(driver, this);
	}
	
	public void homeLinkClk(){
		home.click();
	}
	
	public void myCartLinkClk(){
		myCart.click();
	}
	
	public void myOrdersLinkClk(){
		myOrders.click();
	}
	
	public void myAddressLinkClk(){
		myAddress.click();
	}
	
	public void changePassLinkClk(){
		changePassword.click();
	}
	
	public void privacyPolicyLinkClk(){
		privacyPolicy.click();
	}
	
	public void termsConditionLinkClk(){
		termsConditions.click();
	}
	
	public void logoutLinkClk(){
		logoutBtn.click();
	}
}
