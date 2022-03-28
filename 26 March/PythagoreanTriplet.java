/* 
	Author: Abhishek jha

	Aim : program for pythagorean triplet.

*/

import java.util.*;
class PythagoreanTriplet{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		// check if sum of squares of any two is equal to the third's sqaure

		if((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}