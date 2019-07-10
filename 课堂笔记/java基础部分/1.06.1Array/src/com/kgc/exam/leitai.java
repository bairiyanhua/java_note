package com.kgc.exam;

import java.util.Scanner;

public class leitai {
	public static void main(String[] args) {
		// 获得武威同学的考试成绩，取得最高分输出
		double[] scores = new double[5];
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个同学的成绩:");
			scores[i] = input.nextDouble();

		}
		// 获取成绩中的最好分 max--->擂台
		double max = scores[0];
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("最高分是：" + max);
	}

}
