package com.abhiroop.spring.springin10steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.abhiroop.spring.springin10steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn10StepsBasicApplication {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn10StepsBasicApplication.class)) {
		BinarySearchImpl binarySearch =applicationContext.getBean(BinarySearchImpl.class);
		int toFind = 6;
		Integer result = binarySearch.binarySearch(new int[] {2, 1, 5, 3, 4, 7, 6}, toFind);
		if (result == null) {
			System.out.println("Not Found " + toFind);
		} else {
			System.out.println("Found " + toFind + " at " + result + " index in sorted array");
		}
		}
	}

}
