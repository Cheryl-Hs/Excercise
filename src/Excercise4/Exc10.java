/*
 * �����ϰ��4.10
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ��ҳ��ܱ�5��6��������
 */
package Excercise4;

public class Exc10 {
	
	public static void main(String[] args) {
		final int NUMBER_PER_LINE=10;
		int  count=0;
		
		for (int number=100;number<=1000;number++){
			if (number%5==0&&number%6==0){
				count++;
				if (count%NUMBER_PER_LINE==0){
				System.out.println(number);
				}
				else{
					System.out.print(number+" ");
				}
			}
		}

	}

}
