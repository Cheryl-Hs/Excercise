/*
 * 编程练习题2.16
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算能量
 */
package Excercise2;

import java.util.Scanner;

public class Exc16 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double waterAmount=input.nextDouble();
		System.out.print("Enter the initial temperature: ");
		double initialTemperature=input.nextDouble();
		System.out.print("Enter the final temperature: ");
		double finalTemperature=input.nextDouble();
		
		double energy=waterAmount*(finalTemperature-initialTemperature)*4184;
		
		System.out.println("The energy needed is: "+energy);

	}

}
