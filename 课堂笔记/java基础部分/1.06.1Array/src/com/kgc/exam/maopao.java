package com.kgc.exam;

import java.util.Arrays;

/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class maopao {
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
		
		
		 System.out.println("排序前：");
	        System.out.println(Arrays.toString(num));

	        // 排序方法，默认升序，调用之后，数组内值是排过序的
	        Arrays.sort(num);
	        System.out.println("排序后：");
	        System.out.println(Arrays.toString(num));
		
		
	}

}
