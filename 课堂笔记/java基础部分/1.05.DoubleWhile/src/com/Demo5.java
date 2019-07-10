package com;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * 循环从键盘输入数字，输入0时结束循环
		 * 找出所输入的数字里的最大值和最小值
		 */
		Scanner input = new Scanner(System.in);
		int num;
		int max = 0;
		int min = 0;
		System.out.print("请输入数字,输入0结束：");
		max = min = num = input.nextInt();
		while(num != 0){
			System.out.print("请输入数字,输入0结束：");
			num = input.nextInt();
			if(num > max){
				max = num;
			}
			if(num < min && num != 0){
				min = num;
			}
		}
		System.out.println("最大值是:"+max+"，最小值是:"+min);
		
		
		
	}

}
