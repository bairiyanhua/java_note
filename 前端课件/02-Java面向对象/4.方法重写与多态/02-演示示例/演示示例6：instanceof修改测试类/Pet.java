package cn.jbit.epet.override;
/**
 * 宠物类，狗狗和企鹅的父类
 */
public abstract class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 20;// 亲密度
	
	/**
	 * 无参构造方法
	 */
	public Pet() {
	}
	/**
	 * 有参构造方法
	 * @param name  昵称
	 */
	public Pet(String name) {
		this.name = name;
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

	/**
	 * 输出宠物信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + 
				this.name + "，我的健康值是" + this.health 
				+ "，我和主人的亲密程度是" + this.love + "。");
	}
	
	public abstract void toHospital();
	
	/**
	 * 抽象方法eat(),负责宠物吃饭功能。
	 */
	public abstract void eat();
	
}