package cn.jbit.epet.poly4;

/**
 * 主人类。
 */
public class Master {
	private String name = "";// 主人名字
	private int money = 0; // 元宝数
	/**
	 * 有参构造方法。
	 * @param name 主人名字
	 * @param money 元宝数
	 */
	public Master(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	/**
	 * 主人给宠物喂食。
	 */
	public void feed(Pet pet) {
		pet.eat();
	}
	
	/**
	 * 主人领养宠物
	 * @param typeId 宠物编号
	 * @return
	 */
	public Pet getPet(int typeId){
		Pet pet=null;
		if(typeId==1){
			pet= new Dog("欧欧", "雪娜瑞");
		}else if(typeId==2){
			pet  = new Penguin("楠楠", "Q妹");
		}
		return pet;
	}
	
	/**
	 * 主人与宠物玩耍
	 */
	public void play(Pet pet) {
		if (pet instanceof Dog) {//如果传入的是狗狗
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		}
		else if (pet instanceof Penguin) {//如果传入的是企鹅
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}
}
