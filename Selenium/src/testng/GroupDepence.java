package testng;

import org.testng.annotations.Test;

public class GroupDepence {

	
	@Test(groups={"sign"})
	public void login(){
		System.out.println("Login the application ");
	}
	
	@Test(groups={"sign"})
	public void openApp(){
		System.out.println("Open the application ");
	}
	
	@Test(dependsOnGroups={"sign"})
	public void logout(){
		System.out.println("Logout the application");
	}
}
