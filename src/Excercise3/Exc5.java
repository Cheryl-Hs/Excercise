/*
 * �����ϰ��3.5
 * ���ߣ���ˬ
 * ���ڣ�2014.8.5
 * ���ܣ��������ļӷ�
 */
package Excercise3;

import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number1=(int)(System.currentTimeMillis()%100);
		int number2=(int)(System.currentTimeMillis()*7%100); 
		int number3=(int)(System.currentTimeMillis()*9%100);
		
		System.out.print("What is "+number1+" + "+number2+" + "+number3+" ?");
		int answer=input.nextInt();
		
		System.out.println(number1+" + "+number2+" + "+number3+" = "+answer+
				" is "+(number1+number2+number3==answer));

	}

}
