/*
 * �����ϰ��4.5
 * ���ߣ���ˬ
 * ���ڣ�2014.8.26
 * ���ܣ�ǧ�����֮��Ļ���
 */
package Excercise4;

public class Exc5 {

	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM=2.2;
		
		System.out.printf("%-19s%19s%38s%38s\n","ǧ��","��","��","ǧ��");
		
		for (int kilogram=1,pound1=20;kilogram<200;){
			double pound=kilogram*POUNDS_PER_KILOGRAM;
			double kilogram1=pound1/POUNDS_PER_KILOGRAM;
			kilogram+=2;
			pound1+=5;
			
			System.out.printf("%-8d",kilogram);
			System.out.print("      ");
			System.out.printf("%-8.1f",pound);
			System.out.print("     ");
			System.out.printf("%-8d",pound1);
			System.out.print("     ");
			System.out.printf("%-8.2f\n",kilogram1);
		}


	}

}
