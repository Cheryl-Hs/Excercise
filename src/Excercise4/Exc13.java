/*
 * �����ϰ��4.13
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�������n^2<12000��n�����ֵ
 */
package Excercise4;

public class Exc13 {
	
	public static void main(String[] args) {
		int n=0;
		
		while (Math.pow(n, 2)<12000){
			n++;
		}
		
		System.out.print(n-1);


	}

}
