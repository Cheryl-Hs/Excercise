/*
 * 编程练习题2.4
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:将磅转换为千克
 */
package Excercise2;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pounds=input.nextDouble();
		double KILOGRAMS_PER_POUNDS=0.454;
		double kilograms=pounds*KILOGRAMS_PER_POUNDS;
		
		System.out.println(pounds+" pounds is "+kilograms+" kilograms ");
		

	}

}
