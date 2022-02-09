package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DepenceTest {

	WebDriver driver;
	@Test
	public void openApplication(){
		driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
	}
	
	@Test(dependsOnMethods={"openApplication"})
	public void login(){
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}
	
	
	@Test(dependsOnMethods={"openApplication","login"})
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
