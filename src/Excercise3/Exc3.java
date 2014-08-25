/*
 * 编程练习题3.3
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：求2*2线性方程
 */
package Excercise3;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a, b, c, d, e, f: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		
		double x=(e*d-b*f)/(a*d-b*c);
		double y=(a*f-e*c)/(a*d-b*c);
		
		if (a*d-b*c==0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is "+x+" and y is "+y);

	}

}
