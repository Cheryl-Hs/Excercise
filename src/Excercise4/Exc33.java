/*
 * 编程练习题4.33
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：完全数
 */
package Excercise4;

public class Exc33 {

	public static void main(String[] args) {
		for (int i=1;i<10000;i++){
			int a=0;
			for (int k=1;k<i;k++){
				if (i%k==0){
					a=a+k;
				}
			}
			if (i==a){
				System.out.print(i+" ");
			}
		}

	}

}
