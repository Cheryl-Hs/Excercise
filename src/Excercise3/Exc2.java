/*
 * �����ϰ��3.2
 * ���ߣ���ˬ
 * ���ڣ�2014.8.4
 * ���ܣ����һ�������Ƿ�Ϊż��
 */
package Excercise3;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		
	/*	if (number%2==0)
			System.out.println("Is "+number+" an even number ? ture");
		else
			System.out.println("Is "+number+" an even number ? false");*/
		
		System.out.println("Is "+number+" an even number ? "+(number%2==0));

	}

}
