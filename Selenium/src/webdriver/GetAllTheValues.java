package webdriver;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllTheValues {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/LiveTech/Automation/HTML%20Programs/goBackAndWait.html");
		
		WebElement drop=driver.findElement(By.name("OptWeb"));
		Select select=new Select(drop);
		List<WebElement> list=select.getOptions();
		
		for(WebElement var:list){
			System.out.println(var.getText());
		}
	}
}
