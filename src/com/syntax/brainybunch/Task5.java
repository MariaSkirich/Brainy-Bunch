package com.syntax.brainybunch;

public class Task5 {
	public static void main(String[] args) {
		// second largest number in the array

		int[] array = { 8, 4, 9, 2, 15, 20, 19, 3 };
		int max = array[0];
		int secMax = array[0];

		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		for (int j = 1; j < array.length; j++) {
			if (array[j] > secMax && array[j] < max) {
				secMax = array[j];
			}
		}
		System.out.println("Second largest number is " + secMax);

	
		int[] findSecondLargestNumber = {17, 58, 67, 123, 32, 15, 64, 332, -55, -785, 84, 66, -88, 127};
		int largestNumber = findSecondLargestNumber[0];
		int secondLargestNumber = 0;
		for (int i = 1; i < findSecondLargestNumber.length; i++) {
		    if (findSecondLargestNumber[i] > largestNumber) {
		        secondLargestNumber = largestNumber;
		        largestNumber = findSecondLargestNumber[i];
		    }
		}
		System.out.println("Largest Number: " + largestNumber + "\nSecond Largest Number: " + secondLargestNumber);
	
	
	
	}
}
