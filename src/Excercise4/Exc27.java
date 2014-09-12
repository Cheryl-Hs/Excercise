/*
 * 编程练习题4.27
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：显示闰年
 */
package Excercise4;

public class Exc27 {

	public static void main(String[] args) {
		int count=0;
		final int NUMBER_PER_LINE=10;
		System.out.println("The leap year of 21 century are");
		for (int year=2001;year<=2100;year++){
			if ((year%4==0&&year%100!=0)||(year%400==0)){
				count++;
				System.out.print(year+" ");
				if (count%NUMBER_PER_LINE==0){
					System.out.println();
				}
			}
		}

	}

}
