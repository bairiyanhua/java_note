package com.kgc.exam.pet;

public class Pet extends Animal {

	public String name;
	public int health;
	public int love;

	public void show(){
		System.out.println("������԰�");
		System.out.println("�ҵ����ֽ�"+name+",����ֵ�ǣ�"+health+",�����˵����ܶ��ǣ�"+love);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

}
