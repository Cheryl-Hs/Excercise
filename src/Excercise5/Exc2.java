/*
 * �����ϰ��5.2
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ���һ��������λ����֮��
 */
package Excercise5;
import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		System.out.println("The sum of digits for "+number+" is "+sumDigits(number));

	}
	
	public static int sumDigits(long n){
		int sum=0;
		int number=(int)Math.abs(n);
		while (number!=0){
			int digit=number%10;
			sum=digit+sum;
			number=number/10;
		}
		return sum;
	}

}
