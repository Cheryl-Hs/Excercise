/*
 * �����ϰ��4.40
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ�ģ�⣺�������
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
