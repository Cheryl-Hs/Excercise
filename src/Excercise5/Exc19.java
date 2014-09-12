/*
 * 编程练习题5.1
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：MyTriangle类
 */
package Excercise5;
import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double side1=input.nextDouble();
		double side2=input.nextDouble();
		double side3=input.nextDouble();
		
		if (MyTriangle.isValid(side1,side2,side3)){
			System.out.println("The area is "+MyTriangle.area(side1, side2, side3));
		}
		else{
			System.out.println("The triangle is invalid");
		}

	}

}
