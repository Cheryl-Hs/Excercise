/*
 * 编程练习题4.10
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：找出能被5和6整除的数
 */
package Excercise4;

public class Exc10 {
	
	public static void main(String[] args) {
		final int NUMBER_PER_LINE=10;
		int  count=0;
		
		for (int number=100;number<=1000;number++){
			if (number%5==0&&number%6==0){
				count++;
				if (count%NUMBER_PER_LINE==0){
				System.out.println(number);
				}
				else{
					System.out.print(number+" ");
				}
			}
		}

	}

}
