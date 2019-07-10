package com;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("1.登录系统");
		System.out.println("2.退出");
		System.out.print("请选择：");
		int choose = input.nextInt();
		switch(choose){
		case 1:
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			System.out.print("请选择：");
			int choose2 = input.nextInt();
			switch (choose2) {
			case 1:
				System.out.println("===客户信息管理===");
				System.out.println("1.显示所有客户信息");
				System.out.println("2.添加客户");
				System.out.println("3.修改客户");
				System.out.println("4.查找客户");
				break;
			case 2:
				System.out.println("===购物结算===");
				break;
			case 3:
				System.out.println("===真情回馈===");
				System.out.println("1.幸运大放送");
				System.out.println("2.幸运抽奖");
				System.out.println("3.生日问候");
				break;
			case 4:
				System.out.println("===注销===");
				break;
			}
			break;
		case 2:
			System.out.println("谢谢使用！");
			break;
		}
		
		
		
	}

}
