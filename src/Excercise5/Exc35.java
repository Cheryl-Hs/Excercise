/*
 * 编程练习题5.35
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：五边形的面积
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
