/*
 * �����ϰ��4.41
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�������ĳ��ִ���
 */
package Excercise4;
import java.util.Scanner;

public class Exc41 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter numbers: ");
		int max=input.nextInt();
		int count=1;
		int i;
		
		do{
			i=input.nextInt();
			if (i>max){
				max=i;
				count=1;
			}
			else if (i==max){
				count++;
			}
		}while (i!=0);
		System.out.println("The largest number is "+max);
		System.out.println("The occurrence count of the largest number is "+count);

	}

}
