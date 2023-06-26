package PractiseCoding;

import java.util.Scanner;

public class FactorialDemo {

	static int fact = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter value : ");
		int value = sc.nextInt();
		sc.close();

		System.out.println("factorial of " + value + " --->> " + getFactorial(value));

	}

	public static int getFactorial(int num) {

		if (num == 0) {
			return fact;
		} else if (num < 0) {
			System.out.println("pls enter positive number");
		} else {

			while (num > 0) {
				fact = fact * num;
				num--;
			}

		}

		return fact;
	}

}
