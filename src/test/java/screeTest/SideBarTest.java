package screeTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import screens.Dashboard;
import screens.Login;
import screens.SideBar;
import screens.YourCart;

public class SideBarTest extends Base {

	Login login;
	Dashboard dashboard;
	YourCart yourCart;
	SideBar sidebar;
	
	@BeforeMethod
	public void onDash() throws InterruptedException{
		Thread.sleep(9000);
		login = new Login();
		dashboard = new Dashboard();
		yourCart = new YourCart();
		sidebar = new SideBar();
		
	}
	
	@Test(priority=4, dependsOnGroups="AA")
	public void onHomeLink(){
		sidebar.homeLinkClk();
	}
}
