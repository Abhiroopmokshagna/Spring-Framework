package com.abhiroop.spring.springin10steps;

import org.springframework.stereotype.Component;

@Component 
public class QuickSort implements SortAlgorithm {
	public int partition(int[] numbers, int low, int high) {
		int pivot = numbers[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (numbers[j] < pivot) {
				i++;
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
			}
		}
		int temp = numbers[i+1];
		numbers[i+1] = pivot;
		numbers[high] = temp;
		
		return i + 1;
	}
	
	public int[] quicksort(int[] numbers, int low, int high) {
		if (low < high) {
			int pivot = partition(numbers, low, high);
			quicksort(numbers, low, pivot - 1);
			quicksort(numbers, pivot + 1, high);
		}
		return numbers;
	}
	
	public int[] sort(int[] numbers) {
		return quicksort(numbers, 0, numbers.length - 1);
	}
}
