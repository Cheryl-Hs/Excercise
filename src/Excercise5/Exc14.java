/*
 * 编程练习题5.14
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：计算数列
 */
package Excercise5;

public class Exc14 {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s","i","m(i)");
		System.out.println();
		for (int i=10;i<=100;i+=10){
			System.out.printf("%-20d%-20.5f\n",i,sum(i));
		}

	}
	
	public static double sum(int i){
		double sum1=0;
		for (int n=0;n<i;n++){
			sum1=sum1+Math.pow(-1, n)*(1.0/(2*n+1));
		}
		double sum=4.0*sum1;
		return sum;
	}

}
