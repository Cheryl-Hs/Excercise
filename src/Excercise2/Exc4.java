/*
 * �����ϰ��2.4
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:����ת��Ϊǧ��
 */
package Excercise2;

import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number in pounds: ");
		double pounds=input.nextDouble();
		double KILOGRAMS_PER_POUNDS=0.454;
		double kilograms=pounds*KILOGRAMS_PER_POUNDS;
		
		System.out.println(pounds+" pounds is "+kilograms+" kilograms ");
		

	}

}
