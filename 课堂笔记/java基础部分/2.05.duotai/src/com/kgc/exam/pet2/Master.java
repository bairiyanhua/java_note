package com.kgc.exam.pet2;

public class Master {
	
//	public void feed(Dog dog){
//		System.out.println("�����Թ���");
//	}
//
//	public void feed(Penguin penguin){
//		System.out.println("������С���");
//	}
	
	public void feed(Pet pet){
		if(pet instanceof Dog){
			System.out.println("�����Թ���");
		}else if(pet instanceof Penguin){
			System.out.println("������С���");
		}
	}
	
	
}
