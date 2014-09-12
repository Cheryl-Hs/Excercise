/*
 * 编程练习题5.18
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：使用Math.sqrt方法
 */
package Excercise5;

public class Exc18 {

	public static void main(String[] args) {
		System.out.printf("%-30s%-30s","数字","平方根");
		System.out.println();
		for (int i=0;i<=20;i+=2){
			System.out.printf("%-12d%-20.4f\n",i,Math.sqrt(i));
		}

	}

}
