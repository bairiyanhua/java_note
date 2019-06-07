package com;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
//==============================================================
		
		int j = 0;
		int sum2 = 0;
		do {
			sum2 += j;
			j++;
		} while (j<=100);
		System.out.println(sum2);
		
//========================================================
		
		int sum3 = 0;
		for(int h=0; h<=100; h+=2){
			sum3 += h;
		}
		System.out.println(sum3);
		
		
		for (int k = 0; k < 1; k++) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
