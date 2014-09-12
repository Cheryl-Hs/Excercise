/*
 * 编程练习题5.5
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：对三个数排序
 */
package Excercise5;
import java.util.Scanner;

public class Exc5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three integer: ");
		double num1=input.nextDouble();
		double num2=input.nextDouble();
		double num3=input.nextDouble();
		
		displaySortedNumber(num1,num2,num3);
	}

	public static void displaySortedNumber(double num1, double num2, double num3){
		if (num1>=num2){
			double temp=num1;
			num1=num2;
			num2=temp;
		}
		if (num2>=num3){
			double temp=num2;
			num2=num3;
			num3=temp;
		}
		if (num1>=num2){
			double temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.printf("%-8.4f%-8.4f%-8.4f",num1,num2,num3);
	}
}
