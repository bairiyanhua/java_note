package com.bdqn;

import java.util.Scanner;

public class ScoreAssess {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("请输入考试成绩: "); //提示要输入考试成绩
        int score =  input.nextInt(); 	//从控制台获取成绩
	    if (score >= 80) { // 考试成绩>=80
			System.out.println("良好");
		} else if (score >= 60) { // 80>考试成绩>=60
			System.out.println("中等");
		} else { // 考试成绩<60
			System.out.println("差");
		}
	}
}
