/*
 * 编程练习题4.14
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：显示ASCⅡ码字符表
 */
package Excercise4;

public class Exc14 {

	public static void main(String[] args) {
		int number=(int)'!'-1;
		int NUMBER_PER_LINE=10;
		int count=0;
		
		while (number<(int)'~'){
			number++;
			count++;
			
			if (count%NUMBER_PER_LINE==0){
				System.out.println((char)(number));
			}
			else{
				System.out.print((char)(number)+" ");
			}
		}

	}

}
