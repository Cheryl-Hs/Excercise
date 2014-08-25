/*
 * 编程练习题2.9
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:货币单位
 */
package Excercise2;

import java.util.Scanner;

public class Exc9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int amount=input.nextInt();
		int dollars=amount/100;
		int pennis=amount%100;
		
		System.out.println(amount+" is "+dollars+" dollars  "+pennis+" pennis");

	}

}
