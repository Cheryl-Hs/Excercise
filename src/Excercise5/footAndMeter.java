/*
 * 编程练习题5.9
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：英尺与米之间转换的类
 */
package Excercise5;

public class footAndMeter {

	public static double footToMeter(double foot){
		double meter=0.305*foot;
		return meter;
	}
	
	public static double meterToFoot(double meter){
		double foot=meter/0.305;
		return foot;
	}

}
