/*
 * 编程练习题2.3
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:将英尺转换成米
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
