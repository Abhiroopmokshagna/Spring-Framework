package com.abhiroop.spring.springin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringIn10StepsApplication.class, args);
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
