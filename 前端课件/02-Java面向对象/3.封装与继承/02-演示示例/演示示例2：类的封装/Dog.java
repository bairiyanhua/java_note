package cn.jbit.epet.inherit.after;

/**
 * ���ﹷ����
 * @author administrator
 */
public class Dog {
	private String name = "������"; // �ǳƣ�Ĭ��ֵ��"������"
	private int health = 100; // ����ֵ��Ĭ��ֵ��100������ֵ��1-100֮�䣬С��60Ϊ������
	private int love = 0; // ���ܶ�
	private String strain = "��������������Ȯ"; // Ʒ��
	
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



	public String getStrain() {
		return strain;
	}



	public void setStrain(String strain) {
		this.strain = strain;
	}

	/**
	 * �����������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "������һֻ " + this.strain + "��");
	}



	
}
