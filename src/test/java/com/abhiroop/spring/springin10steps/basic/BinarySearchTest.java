package com.abhiroop.spring.springin10steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.abhiroop.spring.springin10steps.SpringIn10StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn10StepsBasicApplication.class)
public class BinarySearchTest {

	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	public void testBasicScenario() {
		// call method on binary search
		int result = binarySearch.binarySearch(new int[] {1, 5, 2, 3, 1999, 20, 29, 3}, 29);
		//check if the value is correct
		assertEquals(6, result);
	}

}
