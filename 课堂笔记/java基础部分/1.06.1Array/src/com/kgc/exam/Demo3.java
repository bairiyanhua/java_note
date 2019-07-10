package com.kgc.exam;

import java.util.Arrays;

/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		int[] num = {8, 4, 2, 1, 23, 344, 12};
		
		for (int i = 0; i < num.length-1; i++) {
			for (int j = 0; j < num.length-1-i; j++) {
				if(num[j] < num[j+1]){
					int aa = num[j];
					num[j] = num[j+1];
					num[j+1] = aa;
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
		
		
	}

}
