package com.kgc.exam;

public class Penguin {
	//1. 修改属性作用范围
	private String name;
	private String sex;
	private int health;
	private int love = 60;
	
	public void show(){
		System.out.println("企鹅的自白：");
		System.out.println("我的名字是："+name+"，健康值是："+health+"，和主人的亲密度是："+love+"，我的性别是："+sex);
	}
	
	
	//2. 写getter/setter方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(int sexNum) {
		if(sexNum == 1){
			this.sex = "Q仔";
		}else if(sexNum == 2){
			this.sex = "Q妹";
		}else{
			System.out.println("性别输入错误，默认为您分配Q仔");
			this.sex = "Q仔";
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0 || health>100){
			System.out.println("健康值应该在0到100之间，默认为60。");
			this.health = 60;
		}else{
			this.health = health;
		}
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		if(love<0 || love>100){
			System.out.println("亲密度应该在0到100之间，默认为60。");
			this.love = 60;
		}else{
			this.love = love;
		}
	}

	
	
	
}
