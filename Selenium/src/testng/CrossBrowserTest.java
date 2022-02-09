package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {

	WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeClass
	public void openApplication(String browser){
		
		if(browser.equals("Firefox")){
			driver=new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			driver=new ChromeDriver();
		}else if(browser.equals("Ie")){
			driver=new InternetExplorerDriver();
		}
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	@Test
	public void login(){
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
	}
	
	@AfterClass
	public void closeApplication(){
		driver.close();
	}
}
