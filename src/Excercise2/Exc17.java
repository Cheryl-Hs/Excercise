/*
 * 编程练习题2.17
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:风寒温度
 */
package Excercise2;

import java.util.Scanner;

public class Exc17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the temperature in Fahrentheit: ");
		double temperature=input.nextDouble();
		System.out.print("Enter the wind speed miles per hour: ");
		double windSpeed=input.nextDouble();
		
		double windChill=35.74+0.6215*temperature-35.75*Math.pow(windSpeed, 0.16)+
				0.4275*temperature*Math.pow(windSpeed, 0.16);
	
		System.out.println("The wind chill index is "+windChill);
				

	}

}
