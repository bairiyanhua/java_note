package extendAnimal;
/**
 * ����࣬���������
 */
public class Penguin extends Pet {
	private String sex="Q��";// �Ա�

	//�޲ι��췽��
	public Penguin() {
		System.out.println("�����޲ι��췽��");
	}
	
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
		System.out.println("������ι��췽��");
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
}
