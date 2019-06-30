package com.bdqn;
import java.util.Scanner;

public class GetPrize {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
        System.out.print("输入张浩的Java成绩: "); //提示要输入Java成绩
        int score =  input.nextInt(); 	//从控制台获取Java成绩
        if ( score > 90 ) {    			//判断是否大于90分
             System.out.println("老师说:不错，奖励一个iPhone5！");
        }
	}
}
