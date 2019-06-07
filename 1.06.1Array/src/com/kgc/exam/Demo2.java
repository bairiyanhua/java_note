package com.kgc.exam;

import java.util.Arrays;

/**
 * 使用Arrays类
 * @author Administrator
 */
public class Demo2 {
	public static void main(String[] args) {
		
		int[] aa = {2,4,5,8,1};
		int[] bb = {1,2,2};
		
		//判断两个数组是否相同，如果相同，返回true，不相同返回false
		boolean a = Arrays.equals(aa, bb);
		System.out.println(a);
		
		//把数值类的数组从小到大排序
		Arrays.sort(aa);
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i]+" ");
		}
		System.out.println();
		System.out.println("========================================");
		//把数组变成字符串
		String b = Arrays.toString(aa);
		System.out.println(b);
		
		int[] cc = new int[5];
		//将一个空的数组全部元素赋值为指定数值
		Arrays.fill(cc, 250);
		System.out.println(Arrays.toString(cc));
		
		//从指定数组中复制指定长度的元素
		int[] dd = Arrays.copyOf(aa, 7);
		System.out.println(Arrays.toString(dd));
		
		//在指定数组中查找指定元素的下标
		//前提：这个数组要先按从小到大排序
		int d = Arrays.binarySearch(aa, 8);
		System.out.println(d);
		
		
		
		
		
		
		
		
	}

}
