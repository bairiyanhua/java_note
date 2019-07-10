package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * 有4个班级，每个班级有5个学生
		 * 统计每个班学生的总成绩和平均分
		 */
		Scanner input = new Scanner(System.in);
		
//		double sum = 0;
		for (int i = 1; i <= 4; i++) {
			System.out.println("输入第"+i+"个班级的成绩：");
			
			double sum = 0;
			for (int j = 1; j <= 5; j++) {
				System.out.print("输入第"+j+"个学生的成绩：");
//				double score = input.nextDouble();
//				sum = sum + score;
				sum += input.nextDouble();
			}
			System.out.println("当前班级的总成绩是："+sum+",平均分是："+(sum/5));
			System.out.println();
		}
		
		
	}

}
