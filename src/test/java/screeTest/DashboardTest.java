package screeTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import screens.Dashboard;
import screens.Login;
import screens.YourCart;

public class DashboardTest extends Base {

	Login login;
	Dashboard dashboard;
	YourCart yourCart;
	
	
	@BeforeMethod
	public void onDash() throws InterruptedException{
		Thread.sleep(9000);
		login = new Login();
		dashboard = new Dashboard();
		yourCart = new YourCart();
		
	}
	
	/*
	@Test(priority=2)
	public void onClickCart(){
		dashboard.clickOnCart();
	}*/
	
	@Test(priority=3, groups="AA")
	public void onClickMenuIcon(){
		dashboard.clickOnMenu();
	}
}
