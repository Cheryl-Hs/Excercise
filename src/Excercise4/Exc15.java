/*
 * �����ϰ��4.15
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ��������Լ��
 */
package Excercise4;

import java.util.Scanner;

public class Exc15 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int n1=input.nextInt();
		System.out.print("Enter second integer: ");
		int n2=input.nextInt();
		
		int number=(n1<n2)?n1:n2;
		int gcd=1;
		int k=2;
		
		while (k<=number){
			if (number%k==0){
				gcd=k;
			}
			k++;
		}
		System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd);

	}

}
