package com.bdqn;

import java.util.Scanner;

public class GetPrize2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("输入张浩的Java成绩: "); //提示要输入Java成绩
        int score1 =  input.nextInt(); 	//从控制台获取Java成绩
        System.out.print("输入张浩的音乐成绩: "); //提示要输入音乐成绩
        int score2 =  input.nextInt(); 	//从控制台获取音乐成绩
        if ((score1>90 && score2>80) || (score1==100 && score2>70)) {
             System.out.println("老师说:不错，奖励一个iPhone5！");
        }
	}
}
