package com;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//6个订餐信息数组
		String[] names = new String[4]; //订餐人
		String[] menus = new String[4]; //餐品
		int[] times = new int[4]; //送餐时间
		String[] address = new String[4]; //送餐地址
		double[] price = new double[4]; //总金额
		int[] status = new int[4]; //订单状态 1-已完成   0-已预定
		
		//3个菜单数组
		String[] menuName = {"瓦香鸡","炖小鸡","盐水鸭","粉丝汤"};
		double[] moneys = {18.0, 40.0, 45.0, 10.0};
		int[] good = new int[4];
		
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		
		int num = 0; //循环条件
		boolean isExit = false; //判断是否退出系统，默认不退出
		
		do {
			System.out.println("***************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("***************************");
			System.out.print("请选择：");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("---我要订餐---");
				boolean isFull = true; //判断餐袋是否已满
				int i = 0;
				for (i=0; i < names.length; i++) {
					if(names[i] == null){
						isFull = false;
						break;
					}
				}
				if(isFull){
					System.out.println("您的餐袋已满，无法继续订餐！");
				}else{
					System.out.print("请输入订餐人的姓名：");
					String name = input.next();
					
					System.out.println("序号\t菜名\t单价");
					for (int j = 0; j < menuName.length; j++) {
						System.out.println((j+1)+"\t"+menuName[j]+"\t"+moneys[j]+"元");
					}
					System.out.print("请选择您要点的菜品序号：");
					int order = input.nextInt();
					
					System.out.print("请选择您需要的份数：");
					int count = input.nextInt();
					
					System.out.print("请输入送餐时间（送餐时间是10点至20点间整点送餐）:");
					int time = input.nextInt();
					while (time<10 || time >20) {
						System.out.print("对不起，该时间打烊了，不送餐，请重新输入：");
						time = input.nextInt();
					}
					
					System.out.print("请输入送餐地址：");
					String addr = input.next();
					
					System.out.println("订餐成功！");
					System.out.println("您订的是："+menuName[order-1] + " " + count+"份");
					System.out.println("送餐时间：" + time + "点");
					
					//总金额=单价*数量
					double totalMoney = moneys[order-1] * count;
					
					//送餐费。如果总金额>=50，免送餐费
					double song = totalMoney >= 50.0 ? 0.0 : 6.0;
					
					System.out.println("餐费："+totalMoney + "， 送餐费："+song+"， 总计："+(totalMoney+song));
					
					//把所有的订单信息存入对应数组
					names[i] = name;
					menus[i] = menuName[order-1];
					times[i] = time;
					address[i] = addr;
					price[i] = totalMoney+song;
					status[i] = 0;
				}
				break;
			case 2:
				System.out.println("---查看餐袋---");
				System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址	\t总金额\t订单状态");
				for (int j = 0; j < names.length; j++) {
					if(names[j] != null){
						System.out.println((j+1)+"\t"+names[j]+"\t"+menus[j]+"\t"+times[j]+"\t"+address[j]+"\t\t"+price[j]+"\t"+(status[j]==0?"已预定":"已完成"));
					}
				}
				break;
			case 3:
				System.out.println("---签收订单---");
				System.out.print("请选择要签收的订单序号：");
				int order = input.nextInt();
				if(names[order-1] == null){
					System.out.println("您选择的订单不存在！");
				}else{
					if(status[order-1] == 1){
						System.out.println("您选择的订单已完成签收，不能再次签收！");
					}else{
						System.out.println("签收成功！");
						status[order-1] = 1;
					}
				}
				break;
			case 4:
				System.out.println("---删除订单---");
				System.out.print("请选择要删除的订单序号：");
				int del = input.nextInt();
				if(names[del-1] == null){
					System.out.println("您选择的订单不存在！");
				}else{
					if(status[del-1] == 0){
						System.out.println("您选择的订单未签收，不能删除！");
					}else{
						names[del-1] = null;
						menus[del-1] = null;
						times[del-1] = 0;
						address[del-1] = null;
						price[del-1] = 0.0;
						status[del-1] = 0;
						System.out.println("删除成功");
					}
				}
				break;
			case 5:
				System.out.println("---我要点赞---");
				System.out.println("序号\t菜名\t单价");
				for (int j = 0; j < menuName.length; j++) {
					System.out.println((j+1)+"\t"+menuName[j]+"\t"+moneys[j]+"\t"+good[j]+"赞");
				}
				System.out.print("请选择您要点赞的菜品序号：");
				int goodNum = input.nextInt();
				good[goodNum-1] += 1;
				System.out.println("点赞成功！");
				break;
			case 6:
				System.out.println("---退出系统---");
				System.out.println("感谢使用！");
				isExit = true;
				break;
			default:
				System.out.println("没有此选项，请重新选择");
				break;
			}
			
			if(!isExit){
				System.out.println("输入0返回");
				num = input.nextInt();
			}else{
				break;
			}
		} while (num == 0);
		
		
		
	}
	
	

}
