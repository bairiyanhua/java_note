package com;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入小明的java成绩：");
		int javaScore = input.nextInt();
		
		System.out.print("请输入小明的音乐成绩：");
		int musicScore = input.nextInt();
		
		if((javaScore>90 && musicScore>80) || (javaScore==100 && musicScore>70)){
			System.out.println("给奖励");
		}
		
		
		
		
	}
	

}
