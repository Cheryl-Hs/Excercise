/*
 * 编程练习题3.19
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：验证三角形的有效性
 */
package Excercise3;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double edge1=input.nextDouble();
		double edge2=input.nextDouble();
		double edge3=input.nextDouble();
		int triangle=0;
		
		if ((edge1+edge2>edge3)&&(edge1+edge3>edge2)&&(edge2+edge3>edge1))
			triangle=1;
		else
			triangle=0;
		
		System.out.printf("Can edge "+edge1+", "+edge2+", and "+edge3+
				" form a triangle ? "+(triangle==1));
		

	}

}
