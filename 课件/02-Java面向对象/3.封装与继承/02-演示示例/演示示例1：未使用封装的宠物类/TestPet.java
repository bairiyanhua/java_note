package cn.jbit.epet.inherit;

public class TestPet {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.health=-1000;
		dog.love=3;
		dog.name="���";
		dog.strain="������";
		dog.print();
		
		Penguin p=new Penguin();
		p.health=-1000;
		p.love=3;
		p.name="Q��";
		p.sex="��";
		p.print();
	}
}
