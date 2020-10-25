package com.syntax.brainybunch;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {

//		// check if number is prime
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer more than 0");
		int num = scan.nextInt();
		scan.close();
		boolean prime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is Not a Prime Number");
				prime = false;
				break;
			}
		}

		if (prime) {
			System.out.println(num + " is a Prime Number");
		}
		
	}
}
