/* 
	Author: Abhishek jha

	Aim : Print digits of a number in reverse order.

*/
import java.util.Scanner;

class PrintDigits{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		for(;num != 0;num = num/10){System.out.println(num % 10);}
	}
}