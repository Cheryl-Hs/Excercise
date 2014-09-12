/*
 * 编程练习题5.20
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：使用三角函数法
 */
package Excercise5;

public class Exc20 {

	public static void main(String[] args) {
		System.out.printf("%-30s%-30s%-30s","角度","正弦值","余弦值");
		System.out.println();
		for (int i=0;i<=360;i+=10){
			System.out.printf("%-12d%-12.4f%-12.4f\n",i,Math.sin((Math.PI/180)*i),Math.cos((Math.PI/180)*i));
		}
	}

}
