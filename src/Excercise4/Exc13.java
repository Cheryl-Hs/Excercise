/*
 * 编程练习题4.13
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：求满足n^2<12000的n的最大值
 */
package Excercise4;

public class Exc13 {
	
	public static void main(String[] args) {
		int n=0;
		
		while (Math.pow(n, 2)<12000){
			n++;
		}
		
		System.out.print(n-1);


	}

}
