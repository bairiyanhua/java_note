package cn.jbit.epet.poly4;

/**
 * �����ࡣ
 */
public class Master {
	private String name = "";// ��������
	private int money = 0; // Ԫ����
	/**
	 * �вι��췽����
	 * @param name ��������
	 * @param money Ԫ����
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
	 * ���˸�����ιʳ��
	 */
	public void feed(Pet pet) {
		pet.eat();
	}
	
	/**
	 * ������������
	 * @param typeId ������
	 * @return
	 */
	public Pet getPet(int typeId){
		Pet pet=null;
		if(typeId==1){
			pet= new Dog("ŷŷ", "ѩ����");
		}else if(typeId==2){
			pet  = new Penguin("��", "Q��");
		}
		return pet;
	}
	
	/**
	 * �����������ˣ
	 */
	public void play(Pet pet) {
		if (pet instanceof Dog) {//���������ǹ���
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();
		}
		else if (pet instanceof Penguin) {//�������������
			Penguin pgn = (Penguin) pet;
			pgn.swimming();
		}
	}
}
