package PractiseCoding;


public class PrimeNum {

	boolean isprime = true;
	static java.util.ArrayList<Integer> primenums = new java.util.ArrayList<>();


	public void checkPrimeNum(int num) {

		for(int i=2;i<=num/2;i++) {

			if(num%i==0) {
				isprime = false;
			}
		}

		if(isprime) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("number is not prime");
		}

	}

	public static java.util.ArrayList<Integer> checkPrimeFromRange(int start, int end)
	   {
		   for(int i=start;i<=end;i++)
		   {
			   boolean isprime=true;
			   for(int j=2;j<=i/2;j++)
			   {
			    if(i % j == 0)
				{
				isprime=false;
				break;
				}
				}
			   if(isprime)
			   {
				 primenums.add(i);
			   }

		   }
		return primenums;

	   }


	public static void main(String[] args) {

//		PrimeNum obj = new PrimeNum();
//		obj.checkPrimeNum(4);

		System.out.println(checkPrimeFromRange(0,1000) + "number of primenums are : " + primenums.size() );

	}

}
