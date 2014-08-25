/*
 * 编程练习题2.5
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算小费
 */
package Excercise2;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal=input.nextDouble();
		double gratuityRate=input.nextDouble();
		
		double gratuity=subtotal*gratuityRate/100;
		double total=subtotal+gratuity;
		
		System.out.println("The gratuity is "+(int)(gratuity*100)/100.0+
				" and total is "+(int)(total*100)/100.0);

	}

}
