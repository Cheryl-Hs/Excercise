/*
 * �����ϰ��4.4
 * ���ߣ���ˬ
 * ���ڣ�2014.8.26
 * ���ܣ���Ӣ��ת����ǧ��
 */
package Excercise4;

public class Exc4 {

	public static void main(String[] args) {
		final double KILOMETERS_PER_INCH=1.609;
		
		System.out.println("Ӣ��                         ǧ��");
		
		for (int inch=1;inch<=10;inch++){
			double kilometer=inch*KILOMETERS_PER_INCH;
			System.out.printf("%-10d%-8.3f\n",inch,kilometer);
		}

	}

}
