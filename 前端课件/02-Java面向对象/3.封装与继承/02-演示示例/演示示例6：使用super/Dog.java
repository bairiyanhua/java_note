package extendAnimal;
/**
 * �����࣬���������
 */
public class Dog extends Pet {
	private String strain="����Ȯ";// Ʒ��

	//�޲ι��췽��
	public Dog() {
		System.out.println("�����޲ι��췽��");
	}
	
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
		System.out.println("������ι��췽��");
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}

