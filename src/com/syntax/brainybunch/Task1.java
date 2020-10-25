package com.syntax.brainybunch;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// swap two variables
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		System.out.println("Numbers before swap " + a + " and " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swap " + a + " and " + b);

		System.out.println("---------------- 2 strings ----------------");

		String c = "Hello";
		String d = "Goodbye";
		System.out.println("Strings before swap: " + c + " and " + d);

		c = c + d;
		d = c.substring(0, c.length()-d.length());
		c = c.substring(d.length());
		System.out.println("Strings after swap: " + c + " and " + d);
	}

}
