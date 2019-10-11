package utils;



import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCheck {

	
	public static WebDriver driver;

	@Test
	public void launchFirst() throws IOException, InterruptedException{
		
			System.setProperty("webdriver.chrome.driver", "E:/Abhishek/workspaces/gofor20te/chrome/chromedriver.exe");
			driver = new ChromeDriver();
		
			driver.get("http://devbox.bizbrolly.com:8871/");
			driver.manage().window().maximize();
			
			UserData u = new UserData();
			
			ArrayList<String> u1 = u.getUsername();
			ArrayList<String> p1 = u.getPassword();
			
			for(int i=0; i<u1.size(); i++){
				driver.findElement(By.id("uname")).sendKeys(u.getUsername().get(i));
				driver.findElement(By.id("password")).sendKeys(u.getPassword().get(i));
				driver.findElement(By.id("btnSubmit")).click();
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("//*[@id='pcoded']/div[2]/nav/div/div[2]/ul/li/div/div")).click();
			}
			
			
			
	}
	
	
	
}
