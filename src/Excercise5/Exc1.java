/*
 * �����ϰ��5.1
 * ���ߣ���ˬ
 * ���ڣ�2014.8.31
 * ���ܣ������
 */
package Excercise5;

public class Exc1 {

	public static void main(String[] args) {
		printPentagonalNumber(100);

	}
	
	public static void printPentagonalNumber(int n){
		final int NUMBER_PER_LINE=10;
		int count=1;
		for (int i=1;i<=n;i++){
			if (count%NUMBER_PER_LINE==0){
				System.out.printf("%-6d\n",getPentagonalNumber(i));
			}
			else{
				System.out.printf("%-6d",getPentagonalNumber(i));
			}
			count++;
		}
	}
	
	public static int getPentagonalNumber(int n){
		int pentagonalNmber=n*(3*n-1)/2;
		return pentagonalNmber;
	}

}
