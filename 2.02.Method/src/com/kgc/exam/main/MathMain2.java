package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.User;
import com.kgc.exam.MathDemo;

public class MathMain2 {
	
	public static void main(String[] args) {
		/*
		 * 手动输入三门课的成绩
		 * 算出总分和平均分
		 */
		Scanner input = new Scanner(System.in);
		MathDemo math = new MathDemo();
		
		System.out.print("请输入java成绩：");
		double java = input.nextDouble();
		
		System.out.print("请输入c#成绩：");
		double c = input.nextDouble();
		
		System.out.print("请输入db成绩：");
		double db = input.nextDouble();
		
		User aaa = new User();
		//调用有参方法需要把对应的参数传进去
		double sum = math.sum(java, c, db);
		
		System.out.println("总分是：" + sum);
		
		
		
	}

}
