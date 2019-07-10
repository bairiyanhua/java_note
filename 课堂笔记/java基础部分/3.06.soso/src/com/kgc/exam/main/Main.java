package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.util.CardUtil;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CardUtil util = new CardUtil();
		
		do {
			System.out.println();
			System.out.println("*************欢迎使用嗖嗖移动业务大厅***************");
			System.out.println("1.用户登录   2.用户注册   3.使用嗖嗖   4.话费充值  5.资费说明  6.退出系统");
			System.out.print("请选择:");
			int choose = input.nextInt();
			if(choose==1){
				System.out.println("---用户登录---");
			}else if(choose==2){
				System.out.println("---用户注册---");
			}else if(choose==3){
				System.out.println("---使用嗖嗖---");
			}else if(choose==4){
				System.out.println("---话费充值---");
				System.out.print("请输入充值卡号：");
				String cardno = input.next();
				
				if(util.isExits(cardno)){
					System.out.print("请输入充值金额：");
					double money = input.nextDouble();
					//调用方法充值
					
					
				}else{
					System.out.println("对不起，要充值的卡号未注册，无法充值！");
				}
				
				
			}else if(choose==5){
				System.out.println("---资费说明---");
				//调用方法打印资费说明
				util.showMsg();
				
			}else if(choose==6){
				System.out.println("---退出系统---");
				System.out.println("谢谢使用！");
				break;
				
			}else{
				System.out.println("对不起，没有此选项！");
			}
			
			
		} while (true);
		
		
		
		
		
	}
	
}
