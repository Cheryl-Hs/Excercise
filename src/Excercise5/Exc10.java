/*
 * 编程练习题5.10
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：使用isPrime方法
 */
package Excercise5;

import Chapter5.PrimeNumberMethod;

public class Exc10 {

	public static void main(String[] args) {
		int count=0;
		int number=2;
		
		while (number<10000){
			if (PrimeNumberMethod.isPrime(number)){
				count++;
			}
			number++;
		}
		System.out.println("The number of prime from 1 to 10000 is "+count);

	}

}
