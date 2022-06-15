package com.abhiroop.spring.springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public Integer binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = this.sortAlgorithm.sort(numbers);
		for (int number: sortedNumbers) {
			System.out.println(number);
		}
		int low = 0, high = numbers.length - 1;
		Integer index = null;
		while (low < high) {
			int mid = low + (high - low) / 2;
			System.out.println(mid);
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
		System.out.println(index);
		return index;
	}
}
