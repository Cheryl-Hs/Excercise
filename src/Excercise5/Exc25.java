/*
 * �����ϰ��5.25
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ���������ת����Сʱ����������������
 */
package Excercise5;
import java.util.Scanner;

public class Exc25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter millis: ");
		long millis=input.nextLong();
		System.out.print("The time is "+convertMillis(millis));

	}
	
	public static String convertMillis(long millis){
		
		long totalSeconds=millis/1000;
				
		long currentSecond=totalSeconds%60;
				
		long totalMinutes=totalSeconds/60;

		long currentMinute=totalMinutes%60;

		long totalHours=totalMinutes/60;
		
		String currentTime=totalHours+":"+currentMinute+":"+currentSecond;
		
		return currentTime;
	}

}
