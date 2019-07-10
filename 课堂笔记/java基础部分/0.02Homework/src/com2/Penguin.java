package com2;

public class Penguin extends Pet {
	private String sex;
	public void show(){
		System.out.println("企鹅的自白：");
		System.out.println("我的名字叫"+getName()+",健康值是："+getHealth()+",和主人的亲密度是："+getLove()+",我的性别是"+sex);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
	