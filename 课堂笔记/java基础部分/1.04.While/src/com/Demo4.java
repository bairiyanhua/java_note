package com;

import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("输入学生姓名：");
		String name = input.next();
		double sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入5门功课中的第"+i+"门课的成绩：");
//			double score = input.nextDouble();
//			sum = sum + score;
			sum += input.nextDouble();
		}
		System.out.println(name+"的总分是："+sum + "；平均分是："+(sum/5));
		
		
	}

}
