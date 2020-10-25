package com.syntax.brainybunch;

public class Task6 {
	public static void main(String[] args) {
		// create 2D array 3x3 and find sum of all variables

		int[][] num = { 
				{ 10, 2, 3 }, 
				{ 4, 50, 6 }, 
				{ 7, 8, 90 } 
				};
		int sum = 0;

		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				sum += num[r][c];
			}
		}
		System.out.println("Sum of all numbers in the array is " + sum);
	}
}
