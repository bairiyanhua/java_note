package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.Dog;
import com.kgc.exam.Penguin;

public class PetMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Penguin penguin = new Penguin();
		Dog dog = new Dog();
		
		System.out.println("欢迎您来到宠物店！");
		System.out.print("请输入要领养宠物的名字：");
		String name = input.next();
		
		System.out.print("请选择要领养宠物的类型：(1.狗狗  2.企鹅)");
		int type = input.nextInt();
		switch (type) {
		case 1:
			dog.setName(name);
			
			System.out.print("请选择狗狗的品种：(1.世界大暖男金毛   2.拆家小能手二哈)");
			int kind = input.nextInt();
			dog.setKind(kind);
			
			System.out.print("请输入狗狗的健康值(1~100之间)：");
			dog.setHealth(input.nextInt());
			
			dog.show();
			
			break;
		case 2:
			penguin.setName(name);
			
			System.out.print("请选择企鹅的性别：(1.Q仔   2.Q妹)");
			int sexNum = input.nextInt();
			penguin.setSex(sexNum);
			
			System.out.print("请输入企鹅的健康值(1~100之间)：");
			int health = input.nextInt();
			penguin.setHealth(health);
			
			penguin.show();
			
			break;
		default:
			System.out.println("对不起，本店太小，没有该宠物");
			break;
		}
		
		
		
		
	}

}
