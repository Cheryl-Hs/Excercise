/*
 * �����ϰ��4.32
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���Ʊ
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
