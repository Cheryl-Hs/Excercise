/*
 * 编程练习题3.29
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：使用运算符&&、||和^
 */
package Excercise3;

import java.util.Scanner;

public class Exc26 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
		System.out.println("Is "+number+" divisible by 5 and 6? "+(number%5==0&&number%6==0)+
				"\nIs "+number+" divisible by 5 or 6? "+(number%5==0||number%6==0)+
				"\nIs "+number+" divisible by 5 or 6, but not both? "+(number%5==0^number%6==0));

	}

}
