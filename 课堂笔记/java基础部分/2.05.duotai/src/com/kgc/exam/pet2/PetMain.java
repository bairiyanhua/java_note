package com.kgc.exam.pet2;

public class PetMain {
	
	public static void main(String[] args) {
		
		Master master = new Master();
		
		//父类的引用指向子类的对象
		Pet pet = new Dog(); //向上转型/自动类型转换
		pet.show();
		
		
//		Penguin penguin = (Penguin)new Pet(); //向下转型/强制类型转换
		
		
		
		master.feed(pet);
		
	}
}
