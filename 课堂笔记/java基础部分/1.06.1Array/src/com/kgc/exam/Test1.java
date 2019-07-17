package com.kgc.exam;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		 
		 */
		Scanner input = new Scanner(System.in);
		
		double[] scores = new double[5];
		
		for (int i = 1; i <= scores.length; i++) {
			System.out.print("请输入第"+i+"位学员的成绩：");
//			double score = input.nextDouble();
//			scores[i-1] = score;
			scores[i-1] = input.nextDouble();
		}
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		
		
	}
}
