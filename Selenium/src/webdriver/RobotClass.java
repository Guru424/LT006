package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	String title=driver.getTitle();
	
	if(title.equals("OrangeHRM - New Level of HR Management")){
		System.out.println("Title is matched...");
	}else{
		System.out.println("Title not matched....");
	}
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	//String username=driver.findElement(By.name("txtUserName")).getAttribute("value");

	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	driver.close();
	
}
}
