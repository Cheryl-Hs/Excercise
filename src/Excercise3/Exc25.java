/*
 * �����ϰ��3.25
 * ���ߣ���ˬ
 * ���ڣ�2014.8.5
 * ���ܣ�����һ�������ε��ܳ�
 */
package Excercise3;

import java.util.Scanner;

public class Exc25 {

	public static void main(String[] args) {
Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double edge1=input.nextDouble();
		double edge2=input.nextDouble();
		double edge3=input.nextDouble();
		int triangle=0;
		double l=0;
		
		if ((edge1+edge2>edge3)&&(edge1+edge3>edge2)&&(edge2+edge3>edge1)){
			l=edge1+edge2+edge3;
			System.out.println(edge1+", "+edge2+", and "+edge3+
					" can form a triangle\nThe perimeter of the triangle is "
					+l);
		}
		else{
			System.out.println(edge1+", "+edge2+", and "+edge3+
					" can not form a triangle");
		}

		
	}

}
