package com.kgc.exam.pet2;

public class Master {
	
//	public void feed(Dog dog){
//		System.out.println("给狗吃狗粮");
//	}
//
//	public void feed(Penguin penguin){
//		System.out.println("给企鹅吃小鱼干");
//	}
	
	public void feed(Pet pet){
		if(pet instanceof Dog){
			System.out.println("给狗吃狗粮");
		}else if(pet instanceof Penguin){
			System.out.println("给企鹅吃小鱼干");
		}
	}
	
	
}
