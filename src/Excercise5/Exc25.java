/*
 * 编程练习题5.25
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：将毫秒数转换成小时数、分钟数和秒数
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
