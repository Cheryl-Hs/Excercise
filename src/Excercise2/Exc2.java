/*
 * 编程练习题2.2
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算圆柱体体积
 */
package Excercise2;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		final double PI=3.14159;
		
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius=input.nextDouble();
		double length=input.nextDouble();
		double area=radius*radius*PI;
		double volume=area*length;
		
		System.out.println("The area is "+(int)(area*100)/100.0+
				"\nThe volume is "+(int)(volume*100)/100.0);

	}

}
