/*
 * �����ϰ��5.16
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�һ�������
 */
package Excercise5;

public class Exc16 {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s","Year","Days");
		System.out.println();
		for (int year=2000;year<=2010;year++){
			System.out.printf("%-20d%-20d\n",year,numberOfDaysInYear(year));
		}

	}
	
	public static int numberOfDaysInYear(int year){
		int days=365;
		if ((year%4==0&&year%100!=0)||(year%400==0)){
			days=364;
		}
		return days;
	}

}
