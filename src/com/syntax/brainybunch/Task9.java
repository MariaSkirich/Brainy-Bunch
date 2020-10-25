package com.syntax.brainybunch;

public class Task9 {
	public static void main(String[] args) {
		// print all String values using 2 different loops, count values in the 2D array

		String[][] countries = { 
				{ "USA", "Canada", "Mexico" }, 
				{ "Brazil", "Colombia", "Argentina" },
				{ "France", "Germany", "Italy", "Spain" }, 
				{ "Japan", "South Korea", "Uzbekistan", "India" },
				{ "Nigeria", "Kenya", "Morocco", "Senegal" } 
				};
		int sum = 0;

		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			sum += countries[r].length;
			System.out.println();
		}
		System.out.println("------ 2nd way ------");

		for (String[] countArray : countries) {
			for (String country : countArray) {
				System.out.print(country + " ");
			}
			System.out.println();
		}

		System.out.println("----- Amount of values -----");
		System.out.println(sum);

	}
}
