package cn.jbit.epet.override;

public class Test {
	public static void main(String[] args) {
		Pet pet=new Dog();
		pet.print();
		//�������
		//pet.catchingFlyDisc();
		//����ת��
		Dog dog=(Dog)pet;
		dog.catchingFlyDisc();
		
	}
}
