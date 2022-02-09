package JScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDownUp {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	WebElement ele=driver.findElement(By.name("Submit"));
	
	/*driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);*/
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	/*js.executeScript("window.scrollBy(0,500)", "");
	
	
	js.executeScript("window.scrollBy(250,0)", "");*/
	
	//WebElement element=driver.findElement(By.xpath("/html/body/div/div[12]/div/div[1]/a/h3/div"));
	
	js.executeScript("arguments[0].click()", ele);
}
}
