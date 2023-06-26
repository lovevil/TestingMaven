package PractiseCoding;

public class arrayreverse {


	static int[] array= {1,12,42,15,56,2};

	public static void reverseArray(int[] arr) {


		for(int i = arr.length-1 ; i>=0 ; i--) {

			System.out.print(arr[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arrayreverse.reverseArray(array);

	}

}
