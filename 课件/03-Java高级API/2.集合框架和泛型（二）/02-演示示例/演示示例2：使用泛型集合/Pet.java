

/**
* �����࣬���������ĸ��ࡣ
* @author ��������
*/
public abstract class Pet {
	protected String name = "������";// �ǳ�
	protected int health = 100;// ����ֵ
	protected int love = 0;// ���ܶ�
	
	public abstract void eat();  //���󷽷�eat(),�������Է����ܡ�
	
	/**
	 * �޲ι��췽����
	 */
	public Pet() {	
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
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "��");
	}
}

