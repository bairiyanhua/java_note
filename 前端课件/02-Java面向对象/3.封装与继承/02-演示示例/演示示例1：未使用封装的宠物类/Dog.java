package cn.jbit.epet.inherit;

/**
 * ���ﹷ����
 * @author administrator
 */
public class Dog {
	String name = "������"; // �ǳƣ�Ĭ��ֵ��"������"
	int health = 100; // ����ֵ��Ĭ��ֵ��100������ֵ��1-100֮�䣬С��60Ϊ������
	int love = 0; // ���ܶ�
	String strain = "��������������Ȯ"; // Ʒ��
	/**
	 * �����������Ϣ
	 */
	public void print() {
		System.out.println("������԰ף�\n�ҵ����ֽ�" + this.name + 
				"������ֵ��"	+ this.health + "�������˵����ܶ���"
				+ this.love + "������һֻ " + this.strain + "��");
	}
}
