package cn.jbit.epet.override;
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
	
    public void toHospital() {
        this.setHealth(70);
        System.out.println("��ҩ������");
    }
    /**
	 * ʵ�ֳ�ʳ������ 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("���"+this.getName() +"�Ա��ˣ�����Ҫιʳ�ˣ�");
		}else{
			this.setHealth(this.getHealth()+5);
			System.out.println("���"+this.getName() + "�Ա���������ֵ����5��");
		}
	}
}
