package PractiseCoding;

public class GetSumOfLowestMarks {

	static int[][] arr = { { 100, 20, 23, 53 }, { 26, 25, 13, 27 }, { 33, 29, 56, 32 } };

	static int[] arrnew;

	static int arrsize = 4;

	static int[] arrayofsums = new int[arrsize];

	public static void getSum(int[][] arr) {

		for (int[] element : arr) {
			arrnew = element;
			for (int j = 0; j < arrnew.length; j++) {

				arrayofsums[j] = arrayofsums[j] + arrnew[j];

			}

		}

	}

	public static void traverseArray(int[] arr) {

		for (int element : arr) {

			System.out.println(element);
		}

	}

	public static int getLowestOfArray(int[] arr) {

		int lowest=0;


		for (int element : arr) {

			if (lowest < element) {
              lowest = element;
			}

		}

		return lowest;
	}

	public static void main(String[] args) {

		getSum(arr);

		traverseArray(arrayofsums);

		System.out.println(getLowestOfArray(arrayofsums));

	}

}
