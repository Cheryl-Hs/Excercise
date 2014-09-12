/*
 * 编程练习题4.40
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：模拟：正面或反面
 */
package Excercise4;

public class Exc40 {

	public static void main(String[] args) {
		int headCount = 0;
	    int tailCount = 0;

	    for (int i = 0; i < 100000; i++) {
	      int number = (int)(Math.random() * 100000) % 2;

	      if (number == 0)
	        headCount++;
	      else
	        tailCount++;
	    }

	    System.out.println("head count: " + headCount);
	    System.out.println("tail count: " + tailCount);

	}

}
