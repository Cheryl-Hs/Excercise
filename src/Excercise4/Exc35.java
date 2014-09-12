/*
 * 编程练习题4.35
 * 作者：黄爽
 * 日期：2014.8.27
 * 功能：加法
 */
package Excercise4;

public class Exc35 {

	public static void main(String[] args) {
		double sum=0;
		for (int i=1;i<=624;i++){
			sum=sum+1.0/(Math.pow(i,0.5)+Math.pow(i+1,0.5));
		}
		System.out.println("1/(1+√2)+1/(√2+√3)+1/(√3+√4)+...+1/(√624+√625)="+sum);
		
	}

}
