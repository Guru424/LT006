package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/span")).click();
	
	String month="Apr 2022";
	String date="15";
	
	
	
	while(true){
		String MonYear=driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[2]")).getText();
		
		if(MonYear.equals(month)){
			break;
		}
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[3]")).click();
	}
	
	driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td[contains(text(),"+ date +")]")).click();
}
}
