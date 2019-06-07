package com;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入小明的成绩：");
		int score = input.nextInt();
		
		//>=90 优秀  >=80良好 >=70凑合 <70不及格
		/*if(score>=90){
			System.out.println("优秀");
		}
		if(score<90 && score>=80){
			System.out.println("良好");
		}
		if(score<80 && score>=70){
			System.out.println("凑合");
		}
		if(score<70){
			System.out.println("不及格");
		}*/
		
		if(score >= 90){
			System.out.println("优秀");
		}else if(score >= 80){
			System.out.println("良好");
		}else if(score >= 70){
			System.out.println("凑合");
		}else{
			System.out.println("不及格");
		}
		
		
		
		
		
	}

}
