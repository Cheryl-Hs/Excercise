/*
 * �����ϰ��4.45
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ����
 */
package Excercise4;

public class Exc45 {

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=7;i++){
			for (int k=1;k<=7;k++){
				if (k!=i){
					System.out.println(i+" "+k);
					count++;
				}
			}
		}
		System.out.print("The numbers is "+count);

	}

}
