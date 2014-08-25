/*
 * 编程练习题2.1
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能：将摄氏温度转换成华氏温度
 */
package Excercise2;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a degree in Celsius: ");
		double celsius=input.nextDouble();
		
		double fahrenheit=(9.0/5)*celsius+32;
		
		System.out.println(celsius+" Celsius is "+fahrenheit+
				" Fahrenheit");

	}

}
