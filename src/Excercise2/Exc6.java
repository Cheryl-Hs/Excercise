/*
 * �����ϰ��2.6
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:��һ��������λ���ĺ�
 */
package Excercise2;

import java.util.Scanner;

public class Exc6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		 System.out.print("Enter a number between 0 and 1000: ");
		 int number=input.nextInt();
		 
		 int num1=number%10;
		 int remainingnum=number/10;
		 int num2=remainingnum%10;
		 int num3=number/100;
		 int sum=num1+num2+num3;
		 
		 System.out.println("The sum of the digits is "+sum);

	}

}
