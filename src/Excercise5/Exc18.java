/*
 * �����ϰ��5.18
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�ʹ��Math.sqrt����
 */
package Excercise5;

public class Exc18 {

	public static void main(String[] args) {
		System.out.printf("%-30s%-30s","����","ƽ����");
		System.out.println();
		for (int i=0;i<=20;i+=2){
			System.out.printf("%-12d%-20.4f\n",i,Math.sqrt(i));
		}

	}

}
