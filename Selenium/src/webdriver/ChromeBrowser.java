package webdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	WebDriver guru=new ChromeDriver();
	
	//maximize the window
	guru.manage().window().maximize();
	
	guru.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	guru.findElement(By.xpath("//*[@class='loginText']")).sendKeys("admin");
	
	guru.findElement(By.name("txtPassword")).sendKeys("admin");
	
	guru.findElement(By.className("button")).click();
	
	guru.findElement(By.linkText("Logout")).click();
	
	
	guru.quit();
	
}
}
