/*
 * 编程练习题4.1
 * 作者：黄爽
 * 日期：2014.8.24
 * 功能：统计正数和负数的个数，然后计算这些数的平均数
 */

package Excercise4;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an int value,the program exit if the input is 0: ");
		int number;
		int positiveNum=0,negativeNum=0,total=0;
		
		do{
			number=input.nextInt();
			
			if (number>0){
				positiveNum++;	
			}
			else if (number<0){
				negativeNum++;
			}
			total+=number;
		} while(number!=0);
		
		double average=total/1.0/(positiveNum+negativeNum);
		double a=3/2.0;
		
		System.out.println("The number of positives is: "+positiveNum);
		System.out.println("The number of negatives is: "+negativeNum);
		System.out.println("The total is: "+total);
		System.out.println("The average is: "+(int)(average*100)/100.0);
	}

}
