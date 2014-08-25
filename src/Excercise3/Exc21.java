/*
 * 编程练习题3.21
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：计算某天是星期几
 */
package Excercise3;

import java.util.Scanner;

public class Exc21 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: (e.g., 2008): ");
		int year=input.nextInt();
		System.out.print("Enter month: 1-12: ");
		int m=input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int q=input.nextInt();
		
		if (m==1){
			year=year-1;
			m=13;
		}
		if (m==2){
			year=year-1;
			m=14;
		}
		
		int j=Math.abs(year/100);
		int k=year%100;
		int h=(q+(int)((26*(m+1))/10)+k+(int)(k/4)+(int)(j/4)+5*j)%7;
		
		if (h==0){System.out.println("Day of the week is Saterday");}
		else if (h==1){System.out.println("Day of the week is Sunday");}
		else if (h==2){System.out.println("Day of the week is Monday");}
		else if (h==3){System.out.println("Day of the week is Tuesday");}
		else if (h==4){System.out.println("Day of the week is Wensday");}
		else if (h==5){System.out.println("Day of the week is Thrisday");}
		else if (h==1){System.out.println("Day of the week is Friday");}
	
	}

}
