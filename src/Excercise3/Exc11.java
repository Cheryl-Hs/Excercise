/*
 * 编程练习题3.11
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：给出一个月的总天数
 */
package Excercise3;

import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year and month: ");
		int year=input.nextInt();
		int month=input.nextInt();
		int days=0;
		
	/*	if ((year%4==0&&year%100!=0)||(year%400==0)){
			if (month==1){
				days=31;
				System.out.println("January "+year+" has "+days+" days");
			}
			else if (month==2){
				days=28;
				System.out.println("February "+year+" has "+days+" days");
			}
			else if (month==3){
				days=31;
				System.out.println("March "+year+" has "+days+" days");
			}
			else if (month==4){
				days=30;
				System.out.println("April "+year+" has "+days+" days");
			}
			else if (month==5){
				days=31;
				System.out.println("May "+year+" has "+days+" days");
			}
			else if (month==6){
				days=30;
				System.out.println("June "+year+" has "+days+" days");
			}
			else if (month==7){
				days=31;
				System.out.println("July "+year+" has "+days+" days");
			}
			else if (month==8){
				days=31;
				System.out.println("August "+year+" has "+days+" days");
			}
			else if (month==9){
				days=30;
				System.out.println("September "+year+" has "+days+" days");
			}
			else if (month==10){
				days=31;
				System.out.println("October "+year+" has "+days+" days");
			}
			else if (month==11){
				days=30;
				System.out.println("November "+year+" has "+days+" days");
			}
			else if (month==12){
				days=31;
				System.out.println("December "+year+" has "+days+" days");
			}
		}
		else {
			if (month==1){
				days=31;
				System.out.println("January "+year+" has "+days+" days");
			}
			else if (month==2){
				days=29;
				System.out.println("February "+year+" has "+days+" days");
			}
			else if (month==3){
				days=31;
				System.out.println("March "+year+" has "+days+" days");
			}
			else if (month==4){
				days=30;
				System.out.println("April "+year+" has "+days+" days");
			}
			else if (month==5){
				days=31;
				System.out.println("May "+year+" has "+days+" days");
			}
			else if (month==6){
				days=30;
				System.out.println("June "+year+" has "+days+" days");
			}
			else if (month==7){
				days=31;
				System.out.println("July "+year+" has "+days+" days");
			}
			else if (month==8){
				days=31;
				System.out.println("August "+year+" has "+days+" days");
			}
			else if (month==9){
				days=30;
				System.out.println("September "+year+" has "+days+" days");
			}
			else if (month==10){
				days=31;
				System.out.println("October "+year+" has "+days+" days");
			}
			else if (month==11){
				days=30;
				System.out.println("November "+year+" has "+days+" days");
			}
			else if (month==12){
				days=31;
				System.out.println("December "+year+" has "+days+" days");
			}
		}*/
		
		if (month==1){
			days=31;
			System.out.println("January "+year+" has "+days+" days");
		}
		else if (month==2){
			if ((year%4==0&&year%100!=0)||(year%400==0)){
				days=28;
				System.out.println("January "+year+" has "+days+" days");
			}
			else{
				days=29;
				System.out.println("January "+year+" has "+days+" days");
			}
			}
		else if (month==3){
			days=31;
			System.out.println("March "+year+" has "+days+" days");
		}
		else if (month==4){
			days=30;
			System.out.println("April "+year+" has "+days+" days");
		}
		else if (month==5){
			days=31;
			System.out.println("May "+year+" has "+days+" days");
		}
		else if (month==6){
			days=30;
			System.out.println("June "+year+" has "+days+" days");
		}
		else if (month==7){
			days=31;
			System.out.println("July "+year+" has "+days+" days");
		}
		else if (month==8){
			days=31;
			System.out.println("August "+year+" has "+days+" days");
		}
		else if (month==9){
			days=30;
			System.out.println("September "+year+" has "+days+" days");
		}
		else if (month==10){
			days=31;
			System.out.println("October "+year+" has "+days+" days");
		}
		else if (month==11){
			days=30;
			System.out.println("November "+year+" has "+days+" days");
		}
		else if (month==12){
			days=31;
			System.out.println("December "+year+" has "+days+" days");
		}
			

	}

}
