/*
 * �����ϰ��4.12
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�������n^2>12000��n����Сֵ
 */
package Excercise4;

public class EXc12 {

	public static void main(String[] args) {
		int n=0;
		
		while (Math.pow(n, 2)<=12000){
			n++;
		}
		
		System.out.print(n);

	}

}
