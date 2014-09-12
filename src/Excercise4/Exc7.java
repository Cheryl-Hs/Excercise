/*
 * 编程练习题4.7
 * 作者：黄爽
 * 日期：2014.8.26
 * 功能：计算将来的学费
 */
package Excercise4;

public class Exc7 {

	public static void main(String[] args) {
		double tuition=10000;
		for (int years=1;years<=10;years++){
			tuition=tuition*(1+0.05);
		}
		System.out.printf("The tution after 10 years is: %-8.2f dollars\n",tuition);
		for (int year=1;year<=4;year++){
			tuition+=tuition*(1+0.05);
		}
		System.out.printf("The totaltution of 4 years after 10 years is: %-10.2fdollars",tuition);

	}

}
