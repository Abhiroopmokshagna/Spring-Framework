package com.abhiroop.spring.springin10steps.basic;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		//Logic for bubble sort
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j-1] > numbers[j]) {
					int temp = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}
}
