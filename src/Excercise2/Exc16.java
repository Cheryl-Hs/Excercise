/*
 * �����ϰ��2.16
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:��������
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
