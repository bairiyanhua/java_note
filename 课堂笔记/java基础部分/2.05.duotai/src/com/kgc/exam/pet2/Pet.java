package com.kgc.exam.pet2;

public class Pet {

	private String name;
	private int health;
	private int love;

	public void show(){
		System.out.println("������԰ף�");
		System.out.println("�ҵ������ǣ�"+name+",����ֵ�ǣ�"+health+",�����˵����ܶ��ǣ�"+love);
	}
	
	/**
	 * ����������
	 * ��̬��һ�ֱ�����ʽ
	 * @param name
	 * @param health
	 * @param love
	 */
	public void show(String name, int health, int love){
		System.out.println("������԰ף�");
		System.out.println("�ҵ������ǣ�"+name+",����ֵ�ǣ�"+health+",�����˵����ܶ��ǣ�"+love);
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
