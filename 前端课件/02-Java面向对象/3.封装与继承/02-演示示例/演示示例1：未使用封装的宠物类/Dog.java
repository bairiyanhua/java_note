package cn.jbit.epet.inherit;

/**
 * 宠物狗狗类
 * @author administrator
 */
public class Dog {
	String name = "无名氏"; // 昵称，默认值是"无名氏"
	int health = 100; // 健康值，默认值是100，健康值在1-100之间，小于60为不健康
	int love = 0; // 亲密度
	String strain = "聪明的拉布拉多犬"; // 品种
	/**
	 * 输出狗狗的信息
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + 
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love + "，我是一只 " + this.strain + "。");
	}
}
