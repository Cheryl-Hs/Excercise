/*
 * �����ϰ��4.33
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ȫ��
 */
package Excercise4;

public class Exc33 {

	public static void main(String[] args) {
		for (int i=1;i<10000;i++){
			int a=0;
			for (int k=1;k<i;k++){
				if (i%k==0){
					a=a+k;
				}
			}
			if (i==a){
				System.out.print(i+" ");
			}
		}

	}

}
