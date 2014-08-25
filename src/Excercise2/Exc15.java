/*
 * 编程练习题2.15
 * 作者：黄爽
 * 日期：2014.8.2
 * 功能:复利值
 */
package Excercise2;

public class Exc15 {

	public static void main(String[] args) {
		double amount=100;
		double monthlyInterestRate=0.00417;
		double per=1+monthlyInterestRate;
		double remainingAmount1=amount*per;
		double remainingAmount2=(amount+remainingAmount1)*per;
		double remainingAmount3=(amount+remainingAmount2)*per;
		double remainingAmount4=(amount+remainingAmount3)*per;
		double remainingAmount5=(amount+remainingAmount4)*per;
		double remainingAmount6=(amount+remainingAmount5)*per;
		
		System.out.println("The amount is "+(int)(remainingAmount6*1000)/1000.0);
	}

}
