package com;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入姓名：");
		String name = input.next();
		
		System.out.print("请输入成绩：");
		int score = input.nextInt();
		
		if(score <= 10){
			System.out.print("请输入性别：");
			String sex = input.next();
			
			if("男".equals(sex)){
				System.out.println("分入男子组");
			}else if("女".equals(sex)){
				System.out.println("分入女子组");
			}
		}else{
			System.out.println("抱歉，成绩不达标，没进决赛");
		}
		
		
		
	}

}
