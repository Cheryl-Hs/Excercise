/*
 * �����ϰ��4.43
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ĵ���ʱ
 */
package Excercise4;
import java.util.Scanner;

public class Exc43 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of second: ");
		int second=input.nextInt()-1;
		
		while (second!=0){
			if (second==1){
				System.out.println(second+" second remaining");
			}
			else{
				System.out.println(second+" seconds remaining");
			}
			second--;
		}
		System.out.println("Stopped");

	}

}
