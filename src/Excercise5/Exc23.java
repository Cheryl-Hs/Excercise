/*
 * �����ϰ��5.23
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ���ӡ��ĸ
 */
package Excercise5;

import Chapter5.RandomCharacter;

public class Exc23 {

	public static void main(String[] args) {
		final int NUMBER_OF_CHARS=100;
		final int CHARS_PER_LINE=10;
		
		for (int i=0;i<NUMBER_OF_CHARS;i++){
			char ch=RandomCharacter.getRandomUpperCaseLetter();
			if ((i+1)%CHARS_PER_LINE==0){
				System.out.println(ch);
			}
			else{
				System.out.print(ch);
			}
		}

	}

}
