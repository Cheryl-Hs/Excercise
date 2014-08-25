/*
 * 编程练习题2.10
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:使用图形用户界面输入，改写程序清单2-10
 */
package Excercise2;

import javax.swing.JOptionPane;

public class Exc10 {

	public static void main(String[] args) {
		
		String amountString=JOptionPane.showInputDialog(
				"Enter an amount in double,for example 11.56: ");
		double amount=Double.parseDouble(amountString);
		
		int remainingAmount=(int)(amount*100);
		
		int numberOfOneDollars=remainingAmount/100;
		remainingAmount=remainingAmount%100;
		
		int numberOfQuarters=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		int numberOfDimes=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		int numberOfNickels=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		int numberOfPennis=remainingAmount;
		
		String output="Your amount "+amount+" consist of \n"+
		"\t"+numberOfOneDollars+" dollars\n"+
		"\t"+numberOfQuarters+" quarters\n"+
		"\t"+numberOfDimes+" dimes\n"+
		"\t"+numberOfNickels+" nickels\n"+
		"\t"+numberOfPennis+" pennis\n";
		JOptionPane.showMessageDialog(null, output);

	}

}
