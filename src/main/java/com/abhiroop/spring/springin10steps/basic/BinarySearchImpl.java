package com.abhiroop.spring.springin10steps.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
		System.out.println("Algorithm used: " + this.sortAlgorithm);
	}

	public Integer binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
		int low = 0, high = numbers.length - 1;
		Integer index = null;
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (sortedNumbers[mid] == numberToSearchFor) {
				index = mid;
				break;
			}
			if (sortedNumbers[mid] < numberToSearchFor) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index;
	}
	
}
