/*
 * 编程练习题5.12
 * 作者：黄爽
 * 日期：2014.8.31
 * 功能：显示字符
 */
package Excercise5;

public class Exc12 {

	public static void main(String[] args) {
		printChars('1','Z',10);

	}
	
	public static void printChars(char ch1,char ch2,int numberPerLine){
		char ch=(char)ch1;
		for (int i=0;i<(int)(ch2-ch1+1);i++){
			ch=(char)((int)(ch1)+i);
			if ((i+1)%numberPerLine==0){
				System.out.println(ch);
			}
			else{
				System.out.print(ch);
			}
		}
	}

}
