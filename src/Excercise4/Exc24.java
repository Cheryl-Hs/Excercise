/*
 * �����ϰ��4.24
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ��������
 */
package Excercise4;

public class Exc24 {

	public static void main(String[] args) {
		double sum=0.0;
		for (int i=1;i<=97;i++){
			sum=sum+i*1.0/(i+2);
		}
		System.out.println("1/3+3/5+5/7+7/9+9/11+11/13+...+95/97+97/99="+sum);

	}

}
