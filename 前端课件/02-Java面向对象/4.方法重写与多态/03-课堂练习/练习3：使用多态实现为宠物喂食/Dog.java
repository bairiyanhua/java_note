package cn.jbit.epet.override;

/**
 * �����࣬��������ࡣ
 * @author administrator
 */
public class Dog extends Pet {
	private String strain="������";// Ʒ��
	
	public Dog(){}

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
	
	public void toHospital() {
        this.setHealth(60);
        System.out.println("���롢��ҩ");
    }
	
	/**
	 * ʵ�ֳ�ʳ������ 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("����"+this.getName() +"�Ա��ˣ�����Ҫιʳ�ˣ�");
		}else{
			this.setHealth(this.getHealth()+3);
			System.out.println("����"+this.getName() + "�Ա���������ֵ����3��");
		}
	}
}
