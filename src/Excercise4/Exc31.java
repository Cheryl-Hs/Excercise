/*
 * �����ϰ��4.31
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�����CD�ļ�ֵ
 */
package Excercise4;
import java.util.Scanner;

public class Exc31 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double amount=input.nextInt();
		System.out.print("Enter annual percentage yield: ");
		double percentage=input.nextDouble();
		System.out.print("Enter maturity period (number of months): ");
		int month=input.nextInt();
		
		System.out.printf("\n%-30s%-8s","Month","CD Value\n");
		for (int i=1;i<=month;i++){
			amount=amount+amount*percentage/1200;
			System.out.printf("%-30d%-10.2f\n",i,amount);
		}

	}

}
