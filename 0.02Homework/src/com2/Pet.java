package com2;

public class Pet{
 
	private String name;
	private int health;
	private int love;
	
	public void show(){
		System.out.println("宠物的自白");
		System.out.println("我的名字叫"+name+",健康值是："+health+",和主人的亲密度是："+love);
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
