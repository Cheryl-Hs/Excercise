/*
 * �����ϰ��4.10
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ʾ������
 */
package Excercise4;
import java.util.Scanner;

public class Exc17 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the number of lines between 1 and 15: ");
		int lay=input.nextInt();
		
		for (int i=1;i<lay;i++){
			for (int k=1;k<2*(lay-1);k++){
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1;j++){
				if (j==1||j==2*i-1){
					System.out.print(i);
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
