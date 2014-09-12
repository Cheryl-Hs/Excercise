/*
 * 编程练习题4.8
 * 作者：黄爽
 * 日期：2014.8.26
 * 功能：找出最高分
 */
package Excercise4;

import java.util.Scanner;

public class Exc8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int number=input.nextInt();
		System.out.print("Enter the student's name and score: ");
		String name0=input.next();
		int score0=input.nextInt();
		int highest=score0;
		String highestName=name0;
		
		for (int i=1;i<number;i++){
			System.out.println("Enter the student's name and score: ");
		    String name=input.next();
			int score=input.nextInt();
			if (score>highest){
				highest=score;
				highestName=name;
			}
		}
		System.out.println(highestName+"'s score is the highest and the score is "+highest);
	}

}
