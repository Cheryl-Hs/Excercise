/*
 * 编程练习题4.34
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：剪刀、石头、布
 */
package Excercise4;
import java.util.Scanner;

import java.util.Scanner;

public class Exc34 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int random=(int)(Math.random()*3);
		int count=0;
		
		while(count!=2){
		System.out.print("scissor(0), rock(1), papaer(2): ");
		int guess=input.nextInt();
		
		if (random==0){
			if (guess==0)
				System.out.println("The computer is scissor. You are scissor too. "
						+ "It is draw.");
			else if (guess==1)
				System.out.println("The computer is scissor. You are rock. "
						+ "You won.");
			else if (guess==2)
				System.out.println("The computer is scissor. You are paper. "
						+ "You lost.");
		}
		else if (random==1){
			if (guess==0)
				System.out.println("The computer is rock. You are scissor. "
						+ "You lost.");
			else if (guess==1)
				System.out.println("The computer is rock. You are rock too. "
						+ "It is a draw.");
			else if (guess==2)
				System.out.println("The computer is rock. You are paper. "
						+ "You won.");
		}
		else if (random==2){
			if (guess==0)
				System.out.println("The computer is paper. You are scissor. "
						+ "You won.");
			else if (guess==1)
				System.out.println("The computer is paper. You are rock. "
						+ "You lost.");
			else if (guess==2)
				System.out.println("The computer is paper. You are paper too. "
						+ "It is a draw.");
		}
		if (random==guess){
			count++;
			System.out.print(count);
		}
		}


	}

}
