/*
 * �����ϰ��3.18
 * ���ߣ���ˬ
 * ���ڣ�2014.8.5
 * ���ܣ�ʹ������Ի����д�����嵥3-8
 */
package Excercise3;

import javax.swing.JOptionPane;

public class Exc18 {

	public static void main(String[] args) {
		String yearString=JOptionPane.showInputDialog("Enter a year");
		int year=Integer.parseInt(yearString);
		
		boolean isLeapYear=(year%4==0&&year%100!=0)||(year%400==0);
		
		String output=year+" is a leap year �� "+isLeapYear;
		JOptionPane.showMessageDialog(null, output);

	}

}
