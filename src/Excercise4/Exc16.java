/*
 * 编程练习题4.16
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：找出一个整数的因子
 */
package Excercise4;

import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
		System.out.print("The factors for "+number+" is ");
		
		int factor=2;
		while (factor<=number){
			if (number%factor==0){
				number=number/factor;
				System.out.print(factor+",");
			}
			else{
				factor++;
			}
			
		}

	}

}
