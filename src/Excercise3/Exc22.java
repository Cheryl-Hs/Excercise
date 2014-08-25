/*
 * 编程练习题3.21
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：点是否在园内
 */
package Excercise3;

import java.util.Scanner;

public class Exc22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates： ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		double z=Math.pow(x*x+y*y, 0.5);
		
		if (z<10){
			System.out.println("Point ("+x+", "+y+") is in the ciecle");
		}
		else if (z>10){
			System.out.println("Point ("+x+", "+y+") is not in the ciecle");
		}
		else if (z==10){
			System.out.println("Point ("+x+", "+y+") is on the edge of the ciecle");
		}

	}

}
