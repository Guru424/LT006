package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitleText {

	public static void main(String[] args) {


		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		String title=driver.getTitle();
		
		if(title.equals("OrangeHRM - New Level of HR Management")){
			System.out.println("Title is matched...");
		}else{
			System.out.println("Title not matched....");
		}
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		String username=driver.findElement(By.name("txtUserName")).getAttribute("value");

		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		String text=driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText();
		
		if(text.equals("Welcome "+username)){
			System.out.println("Welcome to admin");
		}else{
			System.out.println("Welcome to ...");
		}
		
		driver.close();
	}

}
