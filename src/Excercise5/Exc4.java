/*
 * �����ϰ��5.4
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�������ʾһ������
 */
package Excercise5;
import java.util.Scanner;

public class Exc4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number=input.nextInt();
		System.out.print("Return the integer: ");
		reverse(number);
	}
	
	public static void reverse(int number){
		while (number!=0){
			int digit=number%10;
			System.out.print(digit);
			number=number/10;
		}
	}

}
