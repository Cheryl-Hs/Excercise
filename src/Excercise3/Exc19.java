/*
 * �����ϰ��3.19
 * ���ߣ���ˬ
 * ���ڣ�2014.8.5
 * ���ܣ���֤�����ε���Ч��
 */
package Excercise3;

import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double edge1=input.nextDouble();
		double edge2=input.nextDouble();
		double edge3=input.nextDouble();
		int triangle=0;
		
		if ((edge1+edge2>edge3)&&(edge1+edge3>edge2)&&(edge2+edge3>edge1))
			triangle=1;
		else
			triangle=0;
		
		System.out.printf("Can edge "+edge1+", "+edge2+", and "+edge3+
				" form a triangle ? "+(triangle==1));
		

	}

}
