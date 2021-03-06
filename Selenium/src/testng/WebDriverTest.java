package testng;


import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import log4j.LogUtility;

public class WebDriverTest {
	
	LogUtility file=new LogUtility();
	WebDriver driver;
	@Test
	public void login(){
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}
	
	@Test
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
	}
	
	@AfterClass
	public void closeApplication(){
		driver.close();
	}
	
	@BeforeClass
	public void openApplication(){
		file.conf();
	    driver=new FirefoxDriver();
	   file.logInfo("Firefox browser is opened....");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		file.logInfo("Orange Hrms application is opened...");
	}
}
