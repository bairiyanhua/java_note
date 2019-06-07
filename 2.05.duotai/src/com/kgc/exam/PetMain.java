package com.kgc.exam;

import java.util.Scanner;

public class PetMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到文鼎宠物店");
		System.out.print("请输入您要领养的宠物姓名：");
		String name = input.next();
		
		System.out.print("请输入要领养的宠物类型：1.企鹅   2.狗狗");
		int type = input.nextInt();
		if(type == 1){
			Penguin penguin = new Penguin();
			penguin.setName(name);
			
			System.out.print("输入企鹅的性别：1.Q仔   2.Q妹");
			int sex = input.nextInt();
			penguin.setSex(sex);
			
			penguin.show();
			
		}else if(type == 2){
			Dog dog = new Dog();
			dog.setName(name);
			
			System.out.print("输入狗狗的品种:1.金毛   2.二哈");
			int kind = input.nextInt();
			dog.setKind(kind);
			
			dog.show();
			
		}else{
			System.out.println("本店没有此宠物！");
		}
		
	}

}
