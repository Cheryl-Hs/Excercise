/*
 * 编程练习题4.37
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：十进制到二进制
 */
package Excercise4;
import java.util.Scanner;

public class Exc37 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int decimal=input.nextInt();
		String binaryString="";
		int value=decimal;
		
		while(value!=0){
			int i=value%2;
			value=value/2;
			binaryString=i+binaryString;
		}
		
		System.out.println(decimal + "'s binary representation is " +
		        binaryString);

	}

}
