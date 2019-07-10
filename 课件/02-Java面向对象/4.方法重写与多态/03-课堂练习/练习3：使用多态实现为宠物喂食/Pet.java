package cn.jbit.epet.override;
/**
 * �����࣬���������ĸ���
 */
public abstract class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 20;// ���ܶ�
	
	/**
	 * �޲ι��췽��
	 */
	public Pet() {
	}
	/**
	 * �вι��췽��
	 * @param name  �ǳ�
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
			System.out.println("����ֵӦ����0��100֮�䣬Ĭ��ֵΪ60��");
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
			System.out.println("���ܶ�Ӧ����0��100֮�䣬Ĭ��ֵΪ10��");
			this.love=10;
			return;
		}
		this.love = love;
	}

	/**
	 * ���������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + 
				this.name + "���ҵĽ���ֵ��" + this.health 
				+ "���Һ����˵����̶ܳ���" + this.love + "��");
	}
	
	public abstract void toHospital();
	
	/**
	 * ���󷽷�eat(),�������Է����ܡ�
	 */
	public abstract void eat();
	
}