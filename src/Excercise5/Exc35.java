/*
 * �����ϰ��5.35
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�����ε����
 */
package Excercise5;
import java.util.Scanner;

public class Exc35 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the side: ");
		double side=input.nextDouble();
		
		double area=5*Math.pow(side, 2)/(4*Math.tan(Math.PI/5));
		System.out.print("The area is "+area);

	}

}
