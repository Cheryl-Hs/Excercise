/*
 * 编程练习题4.25
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：计算π
 */
package Excercise4;

public class Exc25 {

	public static void main(String[] args) {
		for (int i=10000;i<=100000;i+=10000){
			double pi=0;
			for (int k=0;k<=i;k++){
				pi=pi+Math.pow(-1,k)/(2*k+1);
			}
			System.out.println("i="+i+", pi="+4*pi);
		}

	}

}
