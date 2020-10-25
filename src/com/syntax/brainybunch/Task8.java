package com.syntax.brainybunch;

public class Task8 {
	public static void main(String[] args) {
		//print sum of odd numbers from 2D array

		int[][] num = { 
				{ 16, 7, 49, -4, 35 }, 
				{ 31, 56, -7, -12, 1 }, 
				{ 0, 3, 6, 9, 5 } 
				};

		int sumOdd = 0;

		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				if (num[r][c] % 2 != 0) {
					sumOdd += num[r][c];
				}
			}
		}

		System.out.println("Sum of odd numbers in the array is " + sumOdd);
		
	
	}
}
