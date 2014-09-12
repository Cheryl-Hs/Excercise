/*
 * 编程练习题4.45
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：组合
 */
package Excercise4;

public class Exc45 {

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=7;i++){
			for (int k=1;k<=7;k++){
				if (k!=i){
					System.out.println(i+" "+k);
					count++;
				}
			}
		}
		System.out.print("The numbers is "+count);

	}

}
