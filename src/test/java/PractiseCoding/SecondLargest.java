package PractiseCoding;

import org.testng.annotations.Test;

public class SecondLargest {



//	int arr[] = {2,5,111,7,6,34,6,2,6,77};
	int arr[] = {2,1,0,0,0,0};


	int largest = 0;
	int secondlargest = 0;

	@Test
	public void checkSecondLargest() {

		for (int element : arr) {
			 if(element>largest) {
				 secondlargest=largest;
				 largest = element;
			 }
			 else if(element>secondlargest && element!=largest) {
				 secondlargest = element;
			 }

		}

		System.out.println("largest number in array is : " + largest );

		System.out.println("Second largest number in array is : " + secondlargest );

	}





}
