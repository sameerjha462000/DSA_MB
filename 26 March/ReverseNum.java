/* 
	Author: Abhishek jha

	Aim : Reverse a number

*/

import java.util.Scanner;

class ReverseNum{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int rev = 0;
		while(num != 0){
			int LastDigit = num % 10;

			rev = rev * 10 + LastDigit;

			num = num / 10;

		}

		System.out.println(rev); 
	}
}