package cn.jbit.epet.inherit2;
/**
 * ����࣬��������ࡣ
 * @author administrator 
 */
public class Penguin extends Pet {
	private String sex;// �Ա�
	/**
	 * �вι��췽����
	 * @param name �ǳ�
	 * @param sex �Ա�
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	
	public void print(){
		super.print();
		System.out.println("�ҵ��Ա���"+this.getSex()+"��");
	}
}
