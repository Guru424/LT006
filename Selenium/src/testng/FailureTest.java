package testng;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class FailureTest {

	public static void main(String[] args) {
		
		TestNG test=new TestNG();
		List<String> list=new ArrayList<>();
		list.add("D:\\LT007\\Selenium\\test-output\\ Filure\\testng-failed.xml");
		test.setTestSuites(list);
		test.run();
	}
}
