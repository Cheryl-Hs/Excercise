/*
 * �����ϰ��4.14
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ʾASC�����ַ���
 */
package Excercise4;

public class Exc14 {

	public static void main(String[] args) {
		int number=(int)'!'-1;
		int NUMBER_PER_LINE=10;
		int count=0;
		
		while (number<(int)'~'){
			number++;
			count++;
			
			if (count%NUMBER_PER_LINE==0){
				System.out.println((char)(number));
			}
			else{
				System.out.print((char)(number)+" ");
			}
		}

	}

}
