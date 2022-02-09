package testng;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups={"Smoke"})
	public void smokeTest1(){
		System.out.println("Smoke Test method 1....");
	}
	
	@Test(groups={"Smoke"})
	public void smokeTest2(){
		System.out.println("Smoke Test method 2....");
	}
	
	@Test(groups={"Smoke"})
	public void smokeTest3(){
		System.out.println("Smoke Test method 3....");
	}
	
	@Test(groups={"Sanity"})
	public void sanityTest1(){
		System.out.println("Sanity Test method 1....");
	}
	
	@Test(groups={"Sanity"})
	public void sanityTest3(){
		System.out.println("Sanity Test method 3....");
	}
	
	@Test(groups={"Sanity"})
	public void sanityTest2(){
		System.out.println("Sanity Test method 2....");
	}
}
