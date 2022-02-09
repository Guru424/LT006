package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

public class AssertTest {

	@Test
	public void login(){
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		String LoginText=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]")).getText();
		
		//Assert.assertEquals("Login Name :", LoginText);
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(true, false);
		
		soft.assertAll();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
}
