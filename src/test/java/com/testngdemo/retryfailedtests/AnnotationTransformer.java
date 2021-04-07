package com.testngdemo.retryfailedtests;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class className, Constructor constructorName, Method methodName) {
		annotation.setRetryAnalyzer(RetryFailedTests.class);
	}

}
			