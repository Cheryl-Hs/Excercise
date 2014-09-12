/*
 * 编程练习题4.43
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：表的倒计时
 */
package Excercise4;
import java.util.Scanner;

public class Exc43 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of second: ");
		int second=input.nextInt()-1;
		
		while (second!=0){
			if (second==1){
				System.out.println(second+" second remaining");
			}
			else{
				System.out.println(second+" seconds remaining");
			}
			second--;
		}
		System.out.println("Stopped");

	}

}
