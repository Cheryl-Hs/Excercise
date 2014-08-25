/*
 * 编程练习题3.29
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：两个圆
 */
package Excercise3;

import java.util.Scanner;

public class Exc29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double r1=input.nextDouble();
		
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double r2=input.nextDouble();
		
		double d=Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1), 0.5);
		
		if (d<(r1-r2)){
			System.out.println("Circle2 is inside circle1");
		}
		else if (d<(r1+r2)){
			System.out.println("Circle2 overlaps circle1");
		}
		else{
			System.out.println("Circle2 does not overlaps circle1");
		}
	}

}
