package cn.jbit.epet.inherit2;

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
		super(name); 
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
}
