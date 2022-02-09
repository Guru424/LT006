package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
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
	
	driver.switchTo().frame(0);
	
	List<WebElement> rows=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
	
	int numOfRows=rows.size();
	
	System.out.println("Total number of rows ="+numOfRows);
	
     List<WebElement> columns=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr[1]/td"));
	
	int numOfcolumns=columns.size();
	
	System.out.println("Total number of columns ="+numOfcolumns);
	
	
	
	for(int i=1;i<numOfRows;i++){
		
		String empId=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+ i +"]/td[2]")).getText();
		
		if(empId.equals("0008")){
			
			driver.findElement(By.xpath("/html/body/div/div[2]/form/table/tbody/tr["+i+"]/td[3]/a")).click();
		break;
		}
	}
	
	//driver.close();
}
}
