/*
 * 编程练习题3.27
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：点是否在三角形内
 */
package Excercise3;

import java.util.Scanner;

public class Exc27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y- coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		
		double h=(100*200)/Math.pow(100*100+200*200, 0.5);System.out.println(h);
		double l=Math.pow(x*x+y*y, 0.5);System.out.println(l);
		
		if (x>0&&y>0){
			if (l>=h&&l<=200){
				System.out.println("The point is in the triangle");
			}
		else{
				System.out.println("The ppoint is not in the triangle");
		}
		}

	}

}
