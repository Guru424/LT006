package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	
	driver.findElement(By.name("Submit")).click();
	
	Actions ac=new Actions(driver);
	
	WebElement admin=driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/a/span"));
	ac.moveToElement(admin).perform();
	Thread.sleep(1000);
	
	WebElement user=driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[7]/a/span"));
	ac.moveToElement(user).perform();
	Thread.sleep(1000);
	
	WebElement hrUser=driver.findElement(By.xpath("/html/body/div[4]/ul/li[1]/ul/li[7]/ul/li[1]/a/span"));
	ac.moveToElement(hrUser).build().perform();
	Thread.sleep(1000);
	
	hrUser.click();

	
	
	
}
}
