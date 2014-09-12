/*
 * 编程练习题5.2
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：求一个整数各位数字之和
 */
package Excercise5;
import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		System.out.println("The sum of digits for "+number+" is "+sumDigits(number));

	}
	
	public static int sumDigits(long n){
		int sum=0;
		int number=(int)Math.abs(n);
		while (number!=0){
			int digit=number%10;
			sum=digit+sum;
			number=number/10;
		}
		return sum;
	}

}
