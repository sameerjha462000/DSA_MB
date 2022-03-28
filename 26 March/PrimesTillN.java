/* 
	Author: Abhishek jha

	Aim : To find all primes till a number N

*/

import java.util.Scanner;
class PrimesTillN{
	public static void main(String[] args){
		// take the number 
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		for(int i = 2; i <= n ; i++){
			//check if i is a prime.
			boolean isprime = true;
			int div = 2;
			while(div * div <= i){
				if(i % div == 0){
					isprime = false;
					break;
				}
				div++;
			}


			// if i is a prime, then print it.
			if(isprime){System.out.println(i);}

		}

	}
}