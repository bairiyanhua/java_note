package cn.jbit.epet.purview;

/**
 * �����࣬���������ĸ��ࡣ
 * @author administrator
 */
public class Pet {
	private String name = "������";// �ǳ�
	private int health = 100;// ����ֵ
	private int love = 0;// ���ܶ�
	/*���������ǲ��Է���Ȩ�޼��̳����*/
	int avoirdupois=2; //����
	protected String color; //��ɫ
	public int id=1001; //���
	/**
	 * �޲ι��췽����
	 */
	public Pet() {
		this.health = 95;
		System.out.println("ִ�г�����޲ι��췽����");
	}
	/**
	 * �вι��췽����
	 * @param name  �ǳ�
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
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + 
				this.name + "���ҵĽ���ֵ��" + this.health 
				+ "���Һ����˵����̶ܳ���" + this.love + "��");
	}
}
