/*
 * �����ϰ��3.1
 * ���ߣ���ˬ
 * ���ڣ�2014.8.4
 * ���ܣ���һԪ���η���
 */
package Excercise3;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a, b, c: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		
		double eq=b*b-4*a*c;
		double r1=(-b+Math.pow(eq, 0.5))/(2*a);
		double r2=(-b-Math.pow(eq, 0.5))/(2*a);
		
		if (eq>0)
			System.out.printf("The roots are %.6f and %.5f",r1,r2);
		else if (eq==0)
			System.out.printf("The root is %.0f",r1);
		else if (eq<0)
			System.out.println("The equation has no real roots");
		
	}

}
