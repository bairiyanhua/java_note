package com2;

import java.util.Scanner;

public class ForIf {
	public static void main(String[] args) {
		// 根据输入班级人数，录入相应成绩，计算80分以上人员的比例
		Scanner input = new Scanner(System.in);
		System.out.println("请录入班级人数：");
		// 班级总人数
		double total = input.nextDouble();
		// 记录班级中大于80分的人数
		int count = 0;
		for (int i = 1; i <= total; i++) {
			System.out.println("请输入第" + i + "个人的成绩：");
			double score = input.nextDouble();
			if (score > 80) {
				count++;
			}
		}
		System.out.println("班级中大于80分的人数是：" + count);
		// double 5 3 3/5→0.6
		double rate = count / total * 100;
		System.out.println("班级中大于80分的人员比例为："+rate+"%");
	}

}
