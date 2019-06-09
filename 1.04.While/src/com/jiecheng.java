package com;

import java.util.Scanner;

public class jiecheng {
	public static void main(String[] args) {
		// 计算n! 1*2*3*4*.....*n
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = input.nextInt();

		int sum = 0;// 记录阶乘总和
		int result = 1;// 阶乘的最终结果
		for (int i = 1; i <= n; i++) {
			result *= i;// result=result*i; 1*1(1!) 1*1*2(2!) 1*1*2*3（3！）........
			sum += result;
		}
		System.out.println(n + "的阶乘是：" + result);
		System.out.println("1!+2!+3!+......"+n+"!=" + sum);

	}
}
