/*
 * 编程练习题3.14
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：猜硬币
 */
package Excercise3;

import java.util.Scanner;

public class Exc14 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double number=Math.random();
		if (number>=0.5)
			number=1;
		else 
			number=0;
		
		System.out.print("Pro is 0, Con is 1, Enter your answer: ");
		int answer=input.nextInt();
		
		if (answer==number)
			System.out.println(answer+" is correct!");
		else
			System.out.println(answer+" is Wrong!");
	}

}
