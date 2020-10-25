package com.syntax.brainybunch;

public class Task3 {
	public static void main(String[] args) {
		// fibonacci sequence
		int num1 = 0;
		int num2 = 1;
		int sum;
		for (int i = 1; i <= 10; i++) {
			System.out.println(num1);
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		
	}
}
