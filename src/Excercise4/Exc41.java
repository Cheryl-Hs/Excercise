/*
 * 编程练习题4.41
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：最大数的出现次数
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
