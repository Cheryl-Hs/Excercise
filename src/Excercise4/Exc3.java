/*
 * 编程练习题4.3
 * 作者：黄爽
 * 日期：2014.8.26
 * 功能：将千克转换成磅
 */
package Excercise4;

public class Exc3 {

	public static void main(String[] args) {
		final double POUNDS_PER_KILOGRAM=2.2;
		
		System.out.println("千克                               磅");
		
		for (int kilogram=1;kilogram<200;kilogram+=2){
			double pound=kilogram*POUNDS_PER_KILOGRAM;
			
			System.out.printf("%-8d%8.1f\n",kilogram,pound);
		}

	}

}
