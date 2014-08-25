/*
 * 编程练习题3.4
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：学习加法
 */
package Excercise3;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		int number1=(int)(System.currentTimeMillis()%100);
		int number2=(int)(System.currentTimeMillis()*7%100);
		
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+" ?");
		int answer=input.nextInt();
		
		System.out.println(number1+" + "+number2+" = "+answer+" is "+
				(number1+number2==answer));

	}

}
