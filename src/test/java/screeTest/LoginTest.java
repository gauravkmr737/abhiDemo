package screeTest;

import java.net.MalformedURLException;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import screens.Login;

public class LoginTest extends Base{

	Login login;
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException{
		init();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		login = new Login();
	}
	
	@Test(priority=1)
	public void loginApp(){
		login.loginToApp();
	}
}
