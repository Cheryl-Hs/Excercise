/*
 * �����ϰ��5.1
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�MyTriangle��
 */
package Excercise5;
import java.util.Scanner;

public class Exc19 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter three edge: ");
		double side1=input.nextDouble();
		double side2=input.nextDouble();
		double side3=input.nextDouble();
		
		if (MyTriangle.isValid(side1,side2,side3)){
			System.out.println("The area is "+MyTriangle.area(side1, side2, side3));
		}
		else{
			System.out.println("The triangle is invalid");
		}

	}

}
