/*
 * 编程练习题2.8
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:求出ASCⅡ码对应的字符
 */
package Excercise2;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an ASCⅡ code: ");
		int code=input.nextInt();
		
		System.out.println("The character for ASCⅡ code "+code+" is "+(char)(code));

	}

}
