/*
 * �����ϰ��5.7
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�����δ��Ͷ�ʼ�ֵ
 */
package Excercise5;
import java.util.Scanner;

public class Exc7 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter inveestment amount: ");
		double investmentAmount=input.nextDouble();
		System.out.print("Enter interest rate: ");
		double interestRate=input.nextDouble();
		int year=30;
		
		System.out.printf("%-20s%-30s","Years","Future Value");
		System.out.println();
		
		for (int i=1;i<=year;i++){
			System.out.printf("%-16d%14.2f\n",i,futureInvestmentRate(investmentAmount,interestRate,i));
		}
		

	}
	
	public static double futureInvestmentRate(
			double investmentAmount, double interestRate, int year){
		double futureInvestmentValue=investmentAmount*Math.pow
				(1+interestRate, year);
		return futureInvestmentValue;
		
	}

}
