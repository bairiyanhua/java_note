package com.kgc.exam;

public class Penguin {
	//1. �޸��������÷�Χ
	private String name;
	private String sex;
	private int health;
	private int love = 60;
	
	public void show(){
		System.out.println("�����԰ף�");
		System.out.println("�ҵ������ǣ�"+name+"������ֵ�ǣ�"+health+"�������˵����ܶ��ǣ�"+love+"���ҵ��Ա��ǣ�"+sex);
	}
	
	
	//2. дgetter/setter����
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
			this.sex = "Q��";
		}else if(sexNum == 2){
			this.sex = "Q��";
		}else{
			System.out.println("�Ա��������Ĭ��Ϊ������Q��");
			this.sex = "Q��";
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health<0 || health>100){
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��Ϊ60��");
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
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��Ϊ60��");
			this.love = 60;
		}else{
			this.love = love;
		}
	}

	
	
	
}
