package cn.jbit.epet.inherit;

/**
 * �������
 * @author administrator
 */
public class Penguin {
	String name = "������"; // �ǳ�
	int health = 100; // ����ֵ
	int love = 0; // ���ܶ�
	String sex = "Q��"; // �Ա�
	/**
	 * ���������Ϣ��
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name +
				"������ֵ��"	+ this.health + "�������˵����ܶ���" 
				+ this.love + "���Ա��� " + this.sex + "��");
	}
}
