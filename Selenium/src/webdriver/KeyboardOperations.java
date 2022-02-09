package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOperations {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.co.in");
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	for(int i=0;i<5;i++){
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	}
	
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	//Open new tab
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
}
}
