package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));
	
	
	/*Wait w=new FluentWait(driver)
			.withTimeout(20, TimeUnit.SECONDS)
			.pollingEvery(5, TimeUnit.SECONDS)
			.ignoring(ElementNotVisibleException e);
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
