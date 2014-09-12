/*
 * 编程练习题5.13
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：数列求和
 */
package Excercise5;

public class Exc13 {

	public static void main(String[] args) {
		System.out.printf("%-20s%-20s","i","m(i)");
		System.out.println();
		for (int i=1;i<=20;i++){
			System.out.printf("%-20d%-20.4f\n",i,sum(i));
		}
		
	}
	
	public static double sum(int i){
		double sum=0;
		for (int n=1;n<=i;n++){
			sum=sum+1.0*n/(n+1);
		}
		return sum;
	}

}
