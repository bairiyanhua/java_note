package com.kgc.exam;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = {8,4,2,1,23,344,12};
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		System.out.println();
		System.out.println("和是："+sum);
		
		System.out.print("输入一个数：");
		int aa = input.nextInt();
		
		boolean isIn = false; //判断存不存在，默认不存在
		for (int i = 0; i < num.length; i++) {
			if(num[i] == aa){
				isIn = true;
				break;
			}
		}
		
		if(isIn){
			System.out.println("存在");
		}else{
			System.out.println("不存在");
		}
		
	}

}
