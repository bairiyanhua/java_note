package com.kgc.exam.pet2;

public class PetMain {
	
	public static void main(String[] args) {
		
		Master master = new Master();
		
		//���������ָ������Ķ���
		Pet pet = new Dog(); //����ת��/�Զ�����ת��
		pet.show();
		
		
//		Penguin penguin = (Penguin)new Pet(); //����ת��/ǿ������ת��
		
		
		
		master.feed(pet);
		
	}
}
