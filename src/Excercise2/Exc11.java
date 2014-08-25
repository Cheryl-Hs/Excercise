/*
 * 综合题2.11
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:工资单
 */
package Excercise2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exc11 {

	public static void main(String[] args) {
		// 使用控制台进行输入和输出
	/*	Scanner input=new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name=input.next();
		System.out.print("Enter number of hours worked in a week: ");
		double weeklyWorkHours=input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate=input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTax=input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTax=input.nextDouble();
		
		double grossPay=weeklyWorkHours*hourlyPayRate;
		double federalWithholding=grossPay*federalTax;
		double stateWithholding=grossPay*stateTax;
		double totalDeduction=federalWithholding+stateWithholding;
		double netPay=grossPay-totalDeduction;
		
		System.out.println("Employee Name: "+name);
		System.out.println("Hours Worked: "+weeklyWorkHours);
		System.out.println("Pay Rate: $"+hourlyPayRate);
		System.out.println("Gross Pay: $"+(int)(grossPay*100)/100.0);
		System.out.println("Deduction:\n"+
		  "\t"+"Federal Withholding "+"("+federalTax*100+"%): $"+
		  (int)(federalWithholding*100)/100.0+"\n"+
		  "\t"+"State Withholding "+"("+stateTax*100+"%): $"+
		  (int)(stateWithholding*100)/100.0+"\n"+
		  "\t"+"Total Deduction: $"+(int)(totalDeduction*100)/100.0);
		System.out.println("Net Pay: $"+(int)(netPay*100)/100.0);*/
		
		//使用对话框获取输入并显示输出
		String nameString=JOptionPane.showInputDialog("Enter employee's name");
		String name=nameString;
		String weeklyWorkHoursString=JOptionPane.showInputDialog
				("Enter number of hours worked in a week: ");
		double weeklyWorkHours=Double.parseDouble(weeklyWorkHoursString);
		String hourlyPayRateString=JOptionPane.showInputDialog
				("Enter hourly pay rate: ");
		double hourlyPayRate=Double.parseDouble(hourlyPayRateString);
		String federalTaxString=JOptionPane.showInputDialog
				("Enter federal tax withholding rate: ");
		double federalTax=Double.parseDouble(federalTaxString);
		String stateTaxString=JOptionPane.showInputDialog
				("Enter state tax withholding rate: ");
		double stateTax=Double.parseDouble(stateTaxString);
		
		double grossPay=weeklyWorkHours*hourlyPayRate;
		double federalWithholding=grossPay*federalTax;
		double stateWithholding=grossPay*stateTax;
		double totalDeduction=federalWithholding+stateWithholding;
		double netPay=grossPay-totalDeduction;
		
		String output="Employee Name: "+name+
		  "\nHours Worked: "+weeklyWorkHours+
		  "\nPay Rate: $"+hourlyPayRate+
		  "\nGross Pay: $"+(int)(grossPay*100)/100.0+
		  "\nDeduction:\n"+
		  "\t"+"Federal Withholding "+"("+federalTax*100+"%): $"+
		  (int)(federalWithholding*100)/100.0+"\n"+
		  "\t"+"State Withholding "+"("+stateTax*100+"%): $"+
		  (int)(stateWithholding*100)/100.0+"\n"+
		  "\t"+"Total Deduction: $"+(int)(totalDeduction*100)/100.0+
		  "\nNet Pay: $"+(int)(netPay*100)/100.0;
		JOptionPane.showMessageDialog(null, output);

	}

}
