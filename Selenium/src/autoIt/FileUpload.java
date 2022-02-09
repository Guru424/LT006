package autoIt;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.filemail.com/share/upload-file");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/section[2]/div/div[2]/div[2]/div[4]/div/label/span")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\RH0172\\Desktop\\AutoLT.exe");
	}
}
