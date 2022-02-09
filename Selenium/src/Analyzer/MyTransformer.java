package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class classTest, Constructor consTest, Method methodTest) {
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
