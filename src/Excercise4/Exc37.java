/*
 * �����ϰ��4.37
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�ʮ���Ƶ�������
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
