/*
 * �����ϰ��2.10
 * ���ߣ���ˬ
 * ���ڣ�2014.8.2
 * ����:ʹ��ͼ���û��������룬��д�����嵥2-10
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
