package com.kgc.exam;

public class Dog {

	private String name;
	private String kind;
	private int health;
	private int love;
	
	private static String aa = "123456";

	public void show(){
		System.out.println("狗狗的自白：");
		System.out.println("我的名字是："+name+"，健康值是："+health+"，和主人的亲密度是："+love+"，我是一只："+kind);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(int kindNum) {
		if(kindNum == 1){
			this.kind = "世界大暖男金毛";
		}else if(kindNum == 2){
			this.kind = "拆家小能手二哈";
		}else{
			System.out.println("您选择的品种不存在，默认为您分配中华田园犬");
			this.kind = "大中华神犬";
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0 || health > 100){
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
