package cn.jbit.epet.override;

public class Test {
	public static void main(String[] args) {
		//Pet pet = new Dog();
		Pet pet=new Penguin();
		//ʹ��instanceof�жϾ���������ͣ������ض����﷽��
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet;
			dog.catchingFlyDisc();//ִ�й������еķ����ӷ���
		} else if (pet instanceof Penguin) {
			Penguin penguin = (Penguin) pet;
			penguin.swim();//ִ��������еķ������ϼ���Ӿ
		}
	}
}
