package cn.jbit.epet.override;

public class Test {
	public static void main(String[] args) {
		Pet dog=new Dog();
		dog.setHealth(10);
		dog.print();
		System.out.println("*************************");
		Master master=new Master();
		master.cure(dog);
		dog.print();
	}
}
