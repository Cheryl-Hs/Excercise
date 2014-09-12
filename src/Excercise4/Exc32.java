/*
 * 编程练习题4.32
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：彩票
 */
package Excercise4;

public class Exc32 {

	public static void main(String[] args) {
		int lotteryDigit1=(int)(Math.random()*10);
		int lotteryDigit2=(int)(Math.random()*10);
		
		while (lotteryDigit1==lotteryDigit2){
			lotteryDigit2=(int)(Math.random()*10);
		}
		System.out.print(lotteryDigit1);
		System.out.print(lotteryDigit2);

	}

}
