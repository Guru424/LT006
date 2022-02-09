package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VariablesTest {
public static void main(String[] args) {
	
	String username="admin";
	String password="admin";
	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys(username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	
	driver.findElement(By.name("Submit")).click();
	
	driver.close();
}
}
