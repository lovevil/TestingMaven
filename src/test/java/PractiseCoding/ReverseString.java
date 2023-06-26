package PractiseCoding;

import java.util.Scanner;

public class ReverseString {

	public String getString() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String value = sc.next();
		sc.close();
		return value;
      }

	public String reverseStringUsingStringBuilder(String value) {

		StringBuilder sb = new StringBuilder(value);

		String reversedstring = sb.reverse().toString();

		return reversedstring;
}

	public String reverseStringUsingCharAt(String value) {

		String newstring="";

		for(int i=value.length()-1;i>=0;i--) {
			newstring = newstring+value.charAt(i);

		}

		return newstring;
	}

public String reverseStringUsingCharTypeArray(String value) {

		String newstring="";
		char[] arr = value.toCharArray();

		for(int i=value.length()-1;i>=0;i--) {
			newstring = newstring+arr[i];
	      }

		return newstring;
	}
public String usingRecurrsion(String value){

	if(value.length() == 0)
		return " ";
		return value.charAt(value.length()-1) + usingRecurrsion(value.substring(0,value.length()-1));

	}

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();

		String value = rs.getString();

		String reversedstring1 = rs.reverseStringUsingStringBuilder(value);

		String reversedstring2 = rs.reverseStringUsingCharAt(value);

		String reversedstring3 = rs.reverseStringUsingCharTypeArray(value);

		String reversedstring4 = rs.usingRecurrsion(value);


		System.out.println(reversedstring1);
		System.out.println(reversedstring2);
		System.out.println(reversedstring3);
		System.out.println(reversedstring4);




	}

}

