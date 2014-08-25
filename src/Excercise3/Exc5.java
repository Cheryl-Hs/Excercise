/*
 * 编程练习题3.5
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：三个数的加法
 */
package Excercise3;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1=(int)(System.currentTimeMillis()%100);
		int number2=(int)(System.currentTimeMillis()*7%100); 
		int number3=(int)(System.currentTimeMillis()*9%100);
		
		System.out.print("What is "+number1+" + "+number2+" + "+number3+" ?");
		int answer=input.nextInt();
		
		System.out.println(number1+" + "+number2+" + "+number3+" = "+answer+
				" is "+(number1+number2+number3==answer));

	}

}
