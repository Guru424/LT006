package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://courses.letskodeit.com/practice");
	
	int size=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(size);
	
	WebElement bmw=driver.findElement(By.id("bmwcheck"));
	if(bmw.isEnabled()){
		bmw.click();
	}
	
	if (bmw.isSelected()) {
		System.out.println("selected...");
	}
driver.close();
}
}
