package testng;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=2,enabled=false)
	public void one(){
		System.out.println("This is the method One");
	}
	
	@Test(priority=1,invocationCount=5)
	public void two(){
		System.out.println("This is the method Two");
	}
	
	@Test(priority=3)
	public void three(){
		System.out.println("This is the method Three");
	}
	
	@Test(priority=4)
	public void four(){
		System.out.println("This is the method Four");
	}
}
