/*
 * �����ϰ��5.20
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�ʹ�����Ǻ�����
 */
package Excercise5;

public class Exc20 {

	public static void main(String[] args) {
		System.out.printf("%-30s%-30s%-30s","�Ƕ�","����ֵ","����ֵ");
		System.out.println();
		for (int i=0;i<=360;i+=10){
			System.out.printf("%-12d%-12.4f%-12.4f\n",i,Math.sin((Math.PI/180)*i),Math.cos((Math.PI/180)*i));
		}
	}

}
