package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/");

	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[1]/div[1]/ul/li[1]/a/img")).click();
	String parentWin=driver.getWindowHandle();
	/*Set<String> windows=driver.getWindowHandles();
	
	Iterator<String> itr=windows.iterator();
	
	while(itr.hasNext()){
		
		String childWin=itr.next();
		
		if(!parentWin.equalsIgnoreCase(childWin)){
			
			driver.switchTo().window(childWin);
			
			//Thread.sleep(3000)		
		
		}
		
		driver.findElement(By.id("nConfig_1_1")).sendKeys("selenium");
		
	}*/
	
	
	for(String childWin:driver.getWindowHandles()){
		driver.switchTo().window(childWin);
		
		driver.findElement(By.id("nConfig_1_1")).sendKeys("selenium");
	}
}
}
