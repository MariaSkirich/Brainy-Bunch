package com.syntax.brainybunch;

public class Task7 {
	public static void main(String[] args) {
		//print out even numbers from 2D array
		
		int[][] num = { 
				{ 16, 7, 49, -4 }, 
				{ 31, 56, -7, -12 }, 
				{ 0, 3, 6, 9 } 
				};

		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				if (num[r][c] % 2 == 0) {
					System.out.print(num[r][c] + " ");
				}
			}
			System.out.println();
		}
	}
}
