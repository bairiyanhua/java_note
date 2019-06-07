package com2;

public class Dog extends Pet {
	private String kind;
	public void show(){
		System.out.println("狗狗的自白：");
		System.out.println("我的名字叫"+getName()+",健康值是："+getHealth()+",和主人的亲密度是："+getLove()+",我是一只"+kind);
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	
	
}
