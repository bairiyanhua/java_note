package com.kgc.exam.main;

import java.util.Scanner;

import com.kgc.exam.Dog;
import com.kgc.exam.Penguin;

public class PetMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Penguin penguin = new Penguin();
		Dog dog = new Dog();
		
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		
		System.out.print("��ѡ��Ҫ������������ͣ�(1.����  2.���)");
		int type = input.nextInt();
		switch (type) {
		case 1:
			dog.setName(name);
			
			System.out.print("��ѡ�񹷹���Ʒ�֣�(1.�����ů�н�ë   2.���С���ֶ���)");
			int kind = input.nextInt();
			dog.setKind(kind);
			
			System.out.print("�����빷���Ľ���ֵ(1~100֮��)��");
			dog.setHealth(input.nextInt());
			
			dog.show();
			
			break;
		case 2:
			penguin.setName(name);
			
			System.out.print("��ѡ�������Ա�(1.Q��   2.Q��)");
			int sexNum = input.nextInt();
			penguin.setSex(sexNum);
			
			System.out.print("���������Ľ���ֵ(1~100֮��)��");
			int health = input.nextInt();
			penguin.setHealth(health);
			
			penguin.show();
			
			break;
		default:
			System.out.println("�Բ��𣬱���̫С��û�иó���");
			break;
		}
		
		
		
		
	}

}
