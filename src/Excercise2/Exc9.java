/*
 * �����ϰ��2.9
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:���ҵ�λ
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
