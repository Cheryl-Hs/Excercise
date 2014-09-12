/*
 * 编程练习题5.9
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：英尺和米之间的转换
 */
package Excercise5;

public class Exc9 {

	public static void main(String[] args) {
		System.out.printf("%-19s%19s%38s%38s\n","英尺","米","米","英尺");
		for (double foot=1.0,meter=20.0;foot<=10.0;){
			System.out.printf("%-8.1f",foot);
			System.out.print("      ");
			System.out.printf("%-8.3f",footAndMeter.footToMeter(foot));
			System.out.print("     ");
			System.out.printf("%-8.1f",meter);
			System.out.print("     ");
			System.out.printf("%-8.3f\n",footAndMeter.meterToFoot(meter));
			
			foot+=1;
			meter+=5;
		}

	}

}
