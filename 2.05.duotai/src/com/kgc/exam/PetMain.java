package com.kgc.exam;

import java.util.Scanner;

public class PetMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�������Ķ������");
		System.out.print("��������Ҫ�����ĳ���������");
		String name = input.next();
		
		System.out.print("������Ҫ�����ĳ������ͣ�1.���   2.����");
		int type = input.nextInt();
		if(type == 1){
			Penguin penguin = new Penguin();
			penguin.setName(name);
			
			System.out.print("���������Ա�1.Q��   2.Q��");
			int sex = input.nextInt();
			penguin.setSex(sex);
			
			penguin.show();
			
		}else if(type == 2){
			Dog dog = new Dog();
			dog.setName(name);
			
			System.out.print("���빷����Ʒ��:1.��ë   2.����");
			int kind = input.nextInt();
			dog.setKind(kind);
			
			dog.show();
			
		}else{
			System.out.println("����û�д˳��");
		}
		
	}

}
