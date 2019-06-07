package com;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入用户名：");
		//next()方法获取到输入的字符串
//		String name = "张三";
		String name = input.next();
		
		System.out.print("请输入年龄：");
		int age = input.nextInt();
//		double height = input.nextDouble();
		
		System.out.println(name + "===" + age);
		
		
	}
	
	

}
