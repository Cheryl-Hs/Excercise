/*
 * �����ϰ��4.3
 * ���ߣ���ˬ
 * ���ڣ�2014.8.26
 * ���ܣ���ǧ��ת���ɰ�
 */
package Excercise4;

public class Exc3 {

	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM=2.2;
		
		System.out.println("ǧ��                               ��");
		
		for (int kilogram=1;kilogram<200;kilogram+=2){
			double pound=kilogram*POUNDS_PER_KILOGRAM;
			
			System.out.printf("%-8d%8.1f\n",kilogram,pound);
		}

	}

}
