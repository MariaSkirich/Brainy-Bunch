package com.syntax.brainybunch;

public class Task4 {
	public static void main(String[] args) {
		// maximum and minimum number in the array
		int[] array = { -9, 12, 94, -59, 0, 84, 73, 5, 9, 1};
		int max = array[0];
		int min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			} else if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		
	
	}
}
