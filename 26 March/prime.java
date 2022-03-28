import java.util.Scanner;

class prime{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		boolean isprime =  true;

		// now check for all numbers from 2 to sqrt(num)

		int div = 2;
		while(div * div <= num){
			if(num % div == 0)
				isprime = false;
			div++;
		}

		if(isprime)
			System.out.println(num + " is prime");
		else
			System.out.println(num + " is not prime");
	}
}