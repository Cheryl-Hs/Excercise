/*
 * �����ϰ��2.3
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:��Ӣ��ת������
 */
package Excercise2;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a value in feet: ");
		
		int feet=input.nextInt();
		double METERS_PER_FEET=0.305;
		
		double meters=feet*METERS_PER_FEET;
		
		System.out.println(feet+" feet is "+meters+" meters");

	}

}
