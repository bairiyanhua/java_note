package com.kgc.exam.pet2;

public class Pet {

	private String name;
	private int health;
	private int love;

	public void show(){
		System.out.println("宠物的自白：");
		System.out.println("我的名字是："+name+",健康值是："+health+",和主人的亲密度是："+love);
	}
	
	/**
	 * 方法的重载
	 * 多态的一种表现形式
	 * @param name
	 * @param health
	 * @param love
	 */
	public void show(String name, int health, int love){
		System.out.println("宠物的自白：");
		System.out.println("我的名字是："+name+",健康值是："+health+",和主人的亲密度是："+love);
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
