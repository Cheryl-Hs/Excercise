/*
 * �����ϰ��5.10
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�ʹ��isPrime����
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
