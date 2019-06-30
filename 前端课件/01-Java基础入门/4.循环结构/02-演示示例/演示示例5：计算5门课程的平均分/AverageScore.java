package cn.jbit.loops2;

import java.util.*;
public class AverageScore{
	/**
	 * 统计80分以上学生比例
	 */
    public static void main(String[] args){
    	int score;             //每门课的成绩
     	int sum = 0;           //成绩之和
     	double avg = 0.0;      //平均分
    	Scanner input = new Scanner(System.in);
    	System.out.print("输入学生姓名: ");
    	String name = input.next(); 	
        for(int i = 0; i < 5; i++){  	//循环5次录入5门课成绩
    	     System.out.print("请输入5门功课中第" + (i+1) + "门课的成绩： ");
    	     score = input.nextInt();  	//录入成绩
    	     sum = sum + score;        	//计算成绩和
    	}
    	avg = (double)sum / 5;                  //计算平均分
    	System.out.println(name + "的平均分是：" + avg);
    }
}

