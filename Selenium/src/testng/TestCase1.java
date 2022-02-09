package testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase1 {

	@Test
	public void test1(){
		Assert.assertTrue(true);
		System.out.println("This is the test case one...");
	}
}
