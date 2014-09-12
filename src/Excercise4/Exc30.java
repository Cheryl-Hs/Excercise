/*
 * 编程练习题4.30
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：复利值
 */
package Excercise4;
import java.util.Scanner;

public class Exc30 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an number,eg:100 : ");
		double number=input.nextInt();
		System.out.print("Enter the year interest,eg:5 : ");
		double interest=input.nextInt()/100.0;
		double monthInterest=interest/12;
		System.out.print("Enter the number of month,eg:6 :");
		int month=input.nextInt();
		
		number=number*(1+monthInterest);
		for (int i=2;i<=month;i++){
			number+=number*(1+monthInterest);
		}
			System.out.print("The number after "+month+" is "+number);

	}

}
