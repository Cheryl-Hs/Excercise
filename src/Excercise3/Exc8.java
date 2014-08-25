/*
 * 编程练习题3.8
 * 作者：黄爽
 * 日期：2014.8.5
 * 功能：对三个数排序
 */
package Excercise3;

import javax.swing.JOptionPane;

public class Exc8 {

	public static void main(String[] args) {
		String num1String=JOptionPane.showInputDialog("Enter an integer");
		int num1=Integer.parseInt(num1String);
		String num2String=JOptionPane.showInputDialog("Enter an integer");
		int num2=Integer.parseInt(num2String);
		String num3String=JOptionPane.showInputDialog("Enter an integer");
		int num3=Integer.parseInt(num3String);
		
		if (num1>=num2){
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		if (num2>=num3){
			int temp=num2;
			num2=num3;
			num3=temp;
		}
		if (num1>=num2){
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.println(num1+"<="+num2+"<="+num3);

	}

}
