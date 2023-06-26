package PractiseCoding;

public class Factorial {

	public static  int checkFactorial(int value ) {

		if(value==1 || value==0) {
			return 1;
		}

		else {
			return (value * checkFactorial(value-1));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Factorial.checkFactorial(6));


	}

}
