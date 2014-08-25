/*
 * 编程练习题2.12
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:计算利息
 */
package Excercise2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exc12 {

	public static void main(String[] args) {
		//使用控制台进行输入和输出
	/*	Scanner input=new Scanner(System.in);
		
		System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
		double balance=input.nextDouble();
		double interestRate=input.nextDouble();
		
		double interest=balance*(interestRate/1200);
		
		System.out.println("The interest is； "+interest);*/
		
		//使用对话框获取输入并显示输出
		String balanceString=JOptionPane.showInputDialog
				("Enter balance (e.g., 3)");
		double balance=Double.parseDouble(balanceString);
		String interestRateString=JOptionPane.showInputDialog
				("Enter interest");
		double interestRate=Double.parseDouble(interestRateString);
		
		double interest=balance*(interestRate/1200);
		
		String output="The interest is\n"+interest;
		JOptionPane.showMessageDialog(null,output);
		
		

	}

}
