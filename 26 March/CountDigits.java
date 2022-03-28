/* 
	Author: Abhishek jha

	Aim : To count digits in a number.

*/
import java.util.Scanner;

class CountDigits{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		int nod = 0;

		for(;num != 0;num = num / 10,nod++){}
		System.out.println(nod);

	}
}