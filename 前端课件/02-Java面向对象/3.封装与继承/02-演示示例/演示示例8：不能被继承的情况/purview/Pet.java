package cn.jbit.epet.purview;

/**
 * 宠物类，狗狗和企鹅的父类。
 * @author administrator
 */
public class Pet {
	private String name = "无名氏";// 昵称
	private int health = 100;// 健康值
	private int love = 0;// 亲密度
	/*以下属性是测试访问权限及继承情况*/
	int avoirdupois=2; //重量
	protected String color; //颜色
	public int id=1001; //编号
	/**
	 * 无参构造方法。
	 */
	public Pet() {
		this.health = 95;
		System.out.println("执行宠物的无参构造方法。");
	}
	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * 输出宠物信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + 
				this.name + "，我的健康值是" + this.health 
				+ "，我和主人的亲密程度是" + this.love + "。");
	}
}
