/*
 * �����ϰ��4.20
 * ���ߣ���ˬ
 * ���ڣ�2014.8.27
 * ���ܣ���ӡ2��1000֮�������
 */
package Excercise4;

public class Exc20 {

	public static void main(String[] args) {
		final int NUMBER_PER_LINE=8;
		int count=0;
		int number=2;
		
		System.out.println("The prime between 2 and 1000 are \n");
		
		while (number<=1000){
			boolean isPrime=true;
			
			for (int divisor=2;divisor<=number/2;divisor++){
				if (number%divisor==0){
					isPrime=false;
					break;
				}
			}
				
				if (isPrime){
					count++;
					
					if (count%NUMBER_PER_LINE==0){
						System.out.println(number);
					}
					else{
						System.out.print(number+" ");
					}
					
				}
			number++;
		}

	}

}
