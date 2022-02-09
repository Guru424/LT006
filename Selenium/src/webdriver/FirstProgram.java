package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
public static void main(String[] args) {
	
	//Create webdriver instance
	WebDriver driver=new FirefoxDriver();
	
	//Open the application url 
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	//Enter the valid user name and password
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	
	//Click on the login button 
	driver.findElement(By.cssSelector(".button")).click();
	
	
	//Close the application and browser
	driver.close();
	
	
	
	
	
}
}
