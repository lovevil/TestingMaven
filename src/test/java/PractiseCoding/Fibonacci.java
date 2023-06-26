package PractiseCoding;

import java.util.Scanner;

public class Fibonacci {

	static int a = 0;
	static int b = 1;
	static int c = a + b;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("enter fibonacci series limit : ");
		int value = sc.nextInt();
		sc.close();
		printFibonacciSeries(value);

	}

	public static void printFibonacciSeries(int num) {

		for (int i = 0; i < num; i++) {

			System.out.println(a);

			a = b;
			b = c;
			c = a + b;

		}

	}

}
