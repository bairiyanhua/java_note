package cn.jbit.epet.purview2;

import cn.jbit.epet.purview.Pet;

/**
 * �����࣬��������ࡣ
 * @author administrator
 */
public class Dog extends Pet {
	private String strain;// Ʒ��

	/**
	 * �вι��췽����
	 * @param name   �ǳ�
	 * @param strain   Ʒ��
	 */
	public Dog(String name, String strain) {
		super(name); //�˴�����ʹ��this.name=name;
		this.strain = strain;
	}
	
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	
	public void print(){
		super.print();
		System.out.println("����һֻ"+this.getStrain()+"Ȯ��");
	}
	
	/**
	 * ���Բ��ܱ��̳е���� 
	 */
	public void test(){
		//System.out.println(name); // ���ܼ̳�private��Ա
		System.out.println(color); // ��ͬ�����Լ̳�protected��Ա
		//System.out.println(avoirdupois);  //��ͬ���£����಻�ܼ̳�Ĭ�Ϸ���Ȩ�޵ĳ�Ա
		System.out.println(id);//��ͬ���£����Լ̳�public��Ա
	}
}
