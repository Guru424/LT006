package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class WebAppTest {
public static void main(String[] args) throws FindFailed, InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	Thread.sleep(3000);
	Screen sc=new Screen();
	Pattern  pt=new Pattern("D:\\Capture1.PNG");
	
	//Thread.sleep(3000);
	sc.click(pt);
}
}
