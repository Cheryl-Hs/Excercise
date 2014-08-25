/*
 * 编程练习题2.7
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:求出年数
 */
package Excercise2;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of minutes: ");
		long minutes=input.nextLong();
		
		long days=minutes/60/24;
		long years=days/365;
		long remainingDays=days%365;
		
		System.out.println(minutes+" minutes is approxiamtely "+years+
				" years and "+remainingDays+" days");
	}

}
