/*
 * 编程练习题2.14
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算BMI
 */
package Excercise2;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double pounds=input.nextDouble();
		System.out.print("Enter height in inches: ");
		double inches=input.nextDouble();
		
		final double GONGJIN_PER_POUNDS=0.45359237;
		final double METERS_PER_INCHES=0.0254;
		
		double weight=pounds*GONGJIN_PER_POUNDS;
		double height=inches*METERS_PER_INCHES;
		
		double bmi=weight/Math.pow(height, 2);
		
		System.out.println("BMI is "+bmi);

	}

}
