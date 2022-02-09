package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleAlert {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("Guru");
	
	driver.findElement(By.name("Submit")).click();
	
	//Handle the Alert
	Alert  alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());
	
	alert.accept();
	
	
	
	
}
}
