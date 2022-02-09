package com.genlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global {

	WebDriver driver;
	public void openBrowser(){
		driver=new FirefoxDriver();
		System.out.println("Firefox browser opened successfully....");
	}
	
	public void openApplication(){
		driver.get(url);
		System.out.println("Orange HRMS application opened successfully....");
	}
	
	public void login(){
		driver.findElement(By.name(username)).sendKeys(user);
		driver.findElement(By.xpath(password)).sendKeys(pwd);
		driver.findElement(By.name(loginBtn)).click();
		
		System.out.println("Login succesfully...");
	}
	
	public void closeBrowser(){
		driver.close();
		System.out.println("Browser closed....");
	}
	
	public void addEmployee(){
		System.out.println("New Employee added successfully....");
	}
}
