/*
 * 编程练习题2.13
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算未来投资值
 */
package Excercise2;

import java.util.Scanner;

public class Exc13 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter inveestment amount: ");
		double investment=input.nextDouble();
		System.out.print("Enter monthly interest rate: ");
		double monthlylInterestRate=input.nextDouble();
		System.out.print("Enter number of years: ");
		int numberOfYears=input.nextInt();
		
		double futureInvestmentValue=investment*Math.pow
				(1+monthlylInterestRate, numberOfYears);
		//System.out.printf("%-10.2f",futureInvestmentValue);
		
		System.out.println("Accumulated value is "+futureInvestmentValue);

	}

}
