/*
 * 编程练习题3.25
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：计算一个三角形的周长
 */
package Excercise3;

import java.util.Scanner;

public class Exc25 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double edge1=input.nextDouble();
		double edge2=input.nextDouble();
		double edge3=input.nextDouble();
		int triangle=0;
		double l=0;
		
		if ((edge1+edge2>edge3)&&(edge1+edge3>edge2)&&(edge2+edge3>edge1)){
			l=edge1+edge2+edge3;
			System.out.println(edge1+", "+edge2+", and "+edge3+
					" can form a triangle\nThe perimeter of the triangle is "
					+l);
		}
		else{
			System.out.println(edge1+", "+edge2+", and "+edge3+
					" can not form a triangle");
		}

		
	}

}
