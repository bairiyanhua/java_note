package cn.jbit.epet.poly;

/**
 * �����࣬��������ࡣ
 * @author ��������
 */
public class Dog extends Pet {
	private String strain;// Ʒ��
	/**
	 * �вι��췽����
	 * @param name   �ǳ�
	 * @param strain   Ʒ��
	 */
	public Dog(String name, String strain) {
		super(name); 
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	/**
	 * ��д�����print������
	 */
	public void print(){
		super.print(); //���ø����print����
		System.out.println("����һֻ " + this.strain + "��");
	}
	/**
	 * ʵ�ֳԷ������� 
	 */
	public void eat() {
		super.health = super.health + 3;
		System.out.println("����"+super.name + "�Ա���������ֵ����3��");
	}
}
