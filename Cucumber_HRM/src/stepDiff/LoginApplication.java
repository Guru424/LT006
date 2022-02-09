package stepDiff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginApplication {

	WebDriver driver;
	@Given("^Open the hrms application$")
	public void Open_the_hrms_application() throws Throwable {
	  driver=new FirefoxDriver();
	  driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}

	  @When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void Enter_valid_username_and_password(String username,String password) throws Throwable {
	 driver.findElement(By.name("txtUserName")).sendKeys(username);
	 driver.findElement(By.name("txtPassword")).sendKeys(password);
	}

	@Then("^Click on the login button$")
	public void Click_on_the_login_button() throws Throwable {
	    driver.findElement(By.name("Submit")).click();
	    driver.close();   
	}

}
