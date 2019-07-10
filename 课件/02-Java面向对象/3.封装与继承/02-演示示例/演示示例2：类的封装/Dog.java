package cn.jbit.epet.inherit.after;

/**
 * 宠物狗狗类
 * @author administrator
 */
public class Dog {
	private String name = "无名氏"; // 昵称，默认值是"无名氏"
	private int health = 100; // 健康值，默认值是100，健康值在1-100之间，小于60为不健康
	private int love = 0; // 亲密度
	private String strain = "聪明的拉布拉多犬"; // 品种
	
	public Dog(){}
	
	public Dog(String name, int health, int love, String strain) {
		super();
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
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
		if(health<0||health>100){
			System.out.println("健康值应该在0至100之间，默认值为60。");
			this.health=60;
			return;
		}
		this.health = health;
	}



	public int getLove() {
		return love;
	}



	public void setLove(int love) {
		if(love<0||love>100){
			System.out.println("亲密度应该在0至100之间，默认值为10。");
			this.love=10;
			return;
		}
		this.love = love;
	}



	public String getStrain() {
		return strain;
	}



	public void setStrain(String strain) {
		this.strain = strain;
	}

	/**
	 * 输出狗狗的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + 
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love + "，我是一只 " + this.strain + "。");
	}



	
}
