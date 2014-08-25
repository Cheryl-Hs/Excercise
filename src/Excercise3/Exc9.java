/*
 * 编程练习题3.9
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：检查ISBN
 */
package Excercise3;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter 9 integer: ");
		int d=input.nextInt();
		int d1=d/100000000;
		int d2=d/10000000%10;
		int d3=d/1000000%10;
		int d4=d/100000%10;
		int d5=d/10000%10;
		int d6=d/1000%10;
		int d7=d/100%10;
		int d8=d/10%10;
		int d9=d%10;
		
		int d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
		
		if (d10==10){
			System.out.print(d);
			System.out.println("x");
		}
		else
			System.out.print(d);
			System.out.println(d10);
		

	}

}
