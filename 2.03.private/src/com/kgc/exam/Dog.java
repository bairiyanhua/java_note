package com.kgc.exam;

public class Dog {

	private String name;
	private String kind;
	private int health;
	private int love;
	
	private static String aa = "123456";

	public void show(){
		System.out.println("�������԰ף�");
		System.out.println("�ҵ������ǣ�"+name+"������ֵ�ǣ�"+health+"�������˵����ܶ��ǣ�"+love+"������һֻ��"+kind);
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
			this.kind = "�����ů�н�ë";
		}else if(kindNum == 2){
			this.kind = "���С���ֶ���";
		}else{
			System.out.println("��ѡ���Ʒ�ֲ����ڣ�Ĭ��Ϊ�������л���԰Ȯ");
			this.kind = "���л���Ȯ";
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health < 0 || health > 100){
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
