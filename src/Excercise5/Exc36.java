/*
 * 编程练习题5.36
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：正多边形的面积
 */
package Excercise5;
import java.util.Scanner;

public class Exc36 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of sides and the side: ");
		int n=input.nextInt();
		double side=input.nextDouble();
		
		System.out.println("The area is "+area(n,side));

	}
	
	public static double area(int n,double side){
		double area=n*Math.pow(side, 2)/(4*Math.tan(Math.PI/5));
		return area;
	}

}
