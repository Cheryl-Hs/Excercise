/*
 * 编程练习题4.10
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：显示金字塔
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
