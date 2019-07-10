package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.MathDemo;

public class MathMain {
	
	public static void main(String[] args) {
		/*
		 * 手动输入三门课的成绩
		 * 算出总分和平均分
		 */
		Scanner input = new Scanner(System.in);
		MathDemo math = new MathDemo();
		
		System.out.print("请输入java成绩：");
		math.java = input.nextDouble();
		
		System.out.print("请输入c#成绩：");
		math.c = input.nextDouble();
		
		System.out.print("请输入db成绩：");
		math.db = input.nextDouble();
		
		double sum = math.sum();
		
		System.out.println("总分是：" + sum);
		
		
		
	}

}
