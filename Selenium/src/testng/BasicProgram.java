package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicProgram {

	@Test
	public void test(){
		System.out.println("This is the Test annotation method");
		Reporter.log("This is the Test annotation method");
	}
	
	@Test
	public void test2(){
		System.out.println("This is the Test annotation method");
		Reporter.log("This is the Test annotation method");
	}
	
	@BeforeMethod
	public void bMethod(){
		System.out.println("This method will execute before Each Test methods");
	}
	
	@AfterMethod
	public void aMethod(){
		System.out.println("This method will execute after Each Test methods");
	}
	
	
	@BeforeClass
	public void bClass(){
		System.out.println("This method will execute before all the test method the current class will invoke");
		
	}
	
	@AfterClass
	public void aClass(){
		System.out.println("This method will execute after all the test method the current class will invoke");
		
	}
	
	
	@BeforeTest
	public void Btest(){
		System.out.println("This method will be execute before class method  ");
	}
	
	@AfterTest
	public void atest(){
		System.out.println("This method will be execute after class method  ");
	}
	
	@BeforeSuite
	public void bSuite(){
		System.out.println("This method will be execute before suite ");
	}
	
	@AfterSuite
	public void aSuite(){
		System.out.println("This method will be execute after suite ");
	}
	
	
}
