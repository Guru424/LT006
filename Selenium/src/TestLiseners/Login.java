package TestLiseners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestLiseners.LisnerTest.class)
public class Login {

	WebDriver driver;
	
	
	@Test
	public void login(){
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPasword")).sendKeys("admin");
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
	    driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
}
