/*
 * 编程练习题4.4
 * 作者：黄爽
 * 日期：2014.8.26
 * 功能：将英里转换成千米
 */
package Excercise4;

public class Exc4 {

	public static void main(String[] args) {
		final double KILOMETERS_PER_INCH=1.609;
		
		System.out.println("英里                         千米");
		
		for (int inch=1;inch<=10;inch++){
			double kilometer=inch*KILOMETERS_PER_INCH;
			System.out.printf("%-10d%-8.3f\n",inch,kilometer);
		}

	}

}
