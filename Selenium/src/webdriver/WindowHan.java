package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHan {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.quackit.com/html/codes/html_popup_window_code.cfm");
		
		String mainWin=driver.getWindowHandle();
		driver.switchTo().frame("result1");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		Thread.sleep(2000);
	/*	
		for(String curWin:driver.getWindowHandles()){
			
			driver.switchTo().window(curWin);		
			if(driver.getTitle().equals("Popup Example")){
				System.out.println(driver.getTitle());
				driver.findElement(By.linkText("Close")).click();
			}		
		}
		*/	
		
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()){
			String cun=itr.next();
			
			if(!mainWin.equalsIgnoreCase(cun)){
				driver.switchTo().window(cun);
				System.out.println(driver.getTitle());
			}
			
			driver.switchTo().window(mainWin);
			driver.findElement(By.linkText("HTML Link Code")).click();
		}
		
		
	}
}
