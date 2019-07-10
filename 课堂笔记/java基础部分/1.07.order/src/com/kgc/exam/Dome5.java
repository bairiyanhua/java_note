package com.kgc.exam;

import java.util.Scanner;

public class Dome5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//定义订单主体数组
		String[] names = new String[4]; //订餐人
		String[] foods = new String[4]; //餐品信息
		int[] times = new int[4]; //送餐时间
		String[] address = new String[4]; //送餐地址
		double[] moneys = new double[4]; //总金额
		int[] status = new int[4]; //订单状态 0-已预定 1-已完成
		
		names[0] = "张三";
		foods[0] = "炖小鸡";
		times[0] = 8;
		address[0] = "文鼎16楼";
		moneys[0] = 40.0;
		status[0] = 0;
		
		//菜品信息
		String[] dishname = {"瓦香鸡","炖小鸡","盐水鸭","粉丝汤"};
		double[] price = {18.0, 40.0, 45.0, 10.0};
		int[] good = new int[4];
		
		int num = 0; //判断循环的条件
		boolean isGo = false; //判断是否退出的条件
		System.out.println("欢迎使用“吃货联盟订餐系统”");
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
				boolean isFull = true; //判断餐袋是否已满，默认满
				for (int i = 0; i < names.length; i++) {
					if(names[i] == null){
						isFull = false;
						System.out.print("请输入订餐人的姓名：");
						String name = input.next();
						
						System.out.println("序号\t菜名\t单价");
						for (int j = 0; j < dishname.length; j++) {
							System.out.println((j+1) + "\t" + dishname[j] + "\t" + price[j]);
						}
						
						System.out.print("请选择您要点的菜品序号：");
						int ord = input.nextInt();
						
						System.out.print("请选择您需要的份数：");
						int count = input.nextInt();
						
						System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐):");
						int time = input.nextInt();
						
						while(time<10 || time>20){
							System.out.print("对不起，该时间打烊了，不送餐，请重新输入：");
							time = input.nextInt();
						}
						
						System.out.print("请输入送餐地址：");
						String addr = input.next();
						
						System.out.println("订餐成功！");
						System.out.println("您订的是：" + dishname[ord-1] + "  "+count+"份");
						System.out.println("送餐时间：" + time + "点");
						
						double canfei = price[ord-1] * count;
						double song = canfei >=50 ? 0.0 : 6.0;
						
						System.out.println("餐费" + canfei + "，送餐费："+song+"，总计：" + (canfei+song));
						
						names[i] = name;
						foods[i] = dishname[ord-1];
						times[i] = time;
						address[i] = addr;
						moneys[i] = canfei+song;
						status[i] = 0;
						
						break;
					}
				}
				if(isFull){
					System.out.println("餐袋已满");
				}
				break;
			case 2:
				System.out.println("---查看餐袋---");
				System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址	\t总金额\t订单状态");
				for (int i = 0; i < names.length; i++) {
					if(names[i] != null){
						System.out.println((i+1)+"\t"+names[i]+"\t"+foods[i]+"\t"+times[i]+"\t"+address[i]+"\t\t"+moneys[i]+"\t"+(status[i]==0?"已预定":"已完成"));
					}
				}
				break;
			case 3:
				System.out.println("---签收订单---");
				System.out.print("请选择要签收的订单序号：");
				int order = input.nextInt();
				//先根据序号判断有没有这个订单
				//如果没有，给出提示;如果有，再看这个订单的状态是不是已预定(0)，如果不是，给出提示
				if(names[order-1] == null){
					System.out.println("您选择的订单不存在！");
				}else{
					if(status[order-1] == 0){
						status[order-1] = 1;
						System.out.println("签收成功！");
					}else if(status[order-1] == 1){
						System.out.println("您选择的订单已签收，不能重复签收！");
					}
				}
				break;
			case 4:
				System.out.println("---删除订单---");
				System.out.print("请选择要删除的订单序号：");
				int del = input.nextInt();
				if(names[del-1]==null){
					System.out.println("您选择的订单不存在！");
				}else{
					if(status[del-1] == 0){
						System.out.println("您选择的订单未签收，不能删除！");
					}else if(status[del-1] == 1){
						names[del-1] = null;
						foods[del-1] = null;
						times[del-1] = 0;
						address[del-1] = null;
						moneys[del-1] = 0.0;
						status[del-1] = 0;
						System.out.println("删除成功！");
					}
				}
				break;
			case 5:
				System.out.println("---我要点赞---");
				System.out.println("序号\t菜名\t单价");
				for (int i = 0; i < dishname.length; i++) {
					System.out.println((i+1) + "\t" + dishname[i] + "\t" + price[i] + "\t" + good[i] + "赞");
				}
				System.out.print("请选择您要点赞的菜品序号：");
				int goodNum = input.nextInt();
				good[goodNum-1] += 1;
				System.out.println("点赞成功！");
				break;
			case 6:
				System.out.println("---退出系统---");
				isGo = true;
				break;
			default:
				System.out.println("输入错误，系统退出");
				isGo = true;
				break;
			}
			
			if(isGo){
				System.out.println("谢谢使用！");
				break;
			}else{
				System.out.println("输入0返回");
				num = input.nextInt();
			}
			
		} while (num == 0);
		
	}

}
