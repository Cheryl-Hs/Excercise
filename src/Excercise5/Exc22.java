/*
 * �����ϰ��5.22
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ�ƽ�����Ľ�����
 */
package Excercise5;
import java.util.Scanner;

public class Exc22 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your guess number: ");
		double number=input.nextDouble();
		
		System.out.println( "The square root for 9 is " + SquareRoot.sqrt(number));

	}

}

class SquareRoot {
	
	public static double sqrt(double number){
		double nextGuess=1.0;
		double lastGuess;
		
		do {
			lastGuess=nextGuess;
			nextGuess=(lastGuess+(number/lastGuess))*0.5;
		} while (Math.abs(nextGuess-lastGuess)>=0.00001);

	    return nextGuess;
	}
}




