package base;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Base {
	
	public static WebDriver driver;
	public static DesiredCapabilities capabilities = new DesiredCapabilities();


	public void init() throws MalformedURLException{
	
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0.1"); 
		capabilities.setCapability("deviceName","Emulator");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.bb.imsh");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.bb.imsh.activity.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
			//Create RemoteWebDriver instance and connect to the Appium server		
		//It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
		 driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		 
		
	
}
}
