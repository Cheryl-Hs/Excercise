/*
 * 编程练习题3.7
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：整钱兑零
 */
package Excercise3;

import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter an amount in double,for example 11.56: ");
		double amount=input.nextDouble();
		
		int remainingAmount=(int)(amount*100);
		
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		int numberOfPennis=remainingAmount;
		
		System.out.println("Your amount "+amount+" consist of");
		if (numberOfOneDollars>1)
			System.out.println("\t"+numberOfOneDollars+" dollars");
		else
			System.out.println("\t"+numberOfOneDollars+" dollar");
		if (numberOfQuarters>1)
			System.out.println("\t"+numberOfQuarters+" quarters");
		else
			System.out.println("\t"+numberOfQuarters+" quarter");
		if (numberOfDimes>1)
			System.out.println("\t"+numberOfDimes+" dimes");
		else
			System.out.println("\t"+numberOfDimes+" dime");
		if (numberOfNickels>1)
			System.out.println("\t"+numberOfNickels+" nickels");
		else
			System.out.println("\t"+numberOfNickels+" nickel");
		if (numberOfPennis>1)
			System.out.println("\t"+numberOfPennis+" pennis");
		else
			System.out.println("\t"+numberOfPennis+" penni");

	}

}
