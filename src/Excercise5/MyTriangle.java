/*
 * 编程练习题5.19
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：MyTriangle类
 */
package Excercise5;

public class MyTriangle {

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1+side2>side3)&&(side1+side3>side2)&&(side2+side3>side1)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static double area(double side1, double side2, double side3){
			double s=(side1+side2+side3)/2;
			double area=Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
		return area;
	}

}
