/*
 * �����ϰ��4.23
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ȡ����ȷ�Ľ��
 */
package Excercise4;

public class Exc23 {

	public static void main(String[] args) {
		double sum0=0.0;
		double sum1=0.0;
		for (int n0=1;n0<=50000;n0++){
			sum0=sum0+1.0/n0;
		}
		System.out.println("1+1/2+1/3+...+1/n="+sum0);
		
		for (int n1=50000;n1>=1;n1--){
			sum1=sum1+1.0/n1;
		}
		System.out.println("1/n+...+3/1+2/1+1="+sum1);
	}

}
