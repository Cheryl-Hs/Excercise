/*
 * �����ϰ��5.11
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�������
 */
package Excercise5;

public class Exc11 {

	public static void main(String[] args) {
		System.out.printf("%-50s%-50s","�����ܶ�","���");
		System.out.println();
		for (int salesAmount=10000;salesAmount<=100000;salesAmount+=5000){
			System.out.printf("%-20d%-12.1f\n",salesAmount,computeCommission(salesAmount));
		}

	}
	
	public static double computeCommission(double salesAmount){
		double commission = 0;
		if (salesAmount>=0.01&&salesAmount<=5000){
			commission=salesAmount*0.08;
		}
		else if (salesAmount>=5000.01&&salesAmount<=100000){
			commission=(salesAmount-5000)*0.1+5000*0.08;
		}
		else if (salesAmount>=10000.01){
			commission=(salesAmount-10000)*0.12+5000*0.1+5000*0.08;
		}
		return commission;
	}

}
