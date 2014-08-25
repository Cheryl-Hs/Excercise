/*
 * 编程练习题2.6
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:求一个整数各位数的和
 */
package Excercise2;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.print("Enter a number between 0 and 1000: ");
		 int number=input.nextInt();
		 
		 int num1=number%10;
		 int remainingnum=number/10;
		 int num2=remainingnum%10;
		 int num3=number/100;
		 int sum=num1+num2+num3;
		 
		 System.out.println("The sum of the digits is "+sum);

	}

}
