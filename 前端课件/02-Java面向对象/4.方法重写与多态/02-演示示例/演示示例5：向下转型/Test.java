package cn.jbit.epet.override;

public class Test {
	public static void main(String[] args) {
		Pet pet=new Dog();
		pet.print();
		//错误代码
		//pet.catchingFlyDisc();
		//向下转型
		Dog dog=(Dog)pet;
		dog.catchingFlyDisc();
		
	}
}
