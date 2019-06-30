package cn.jbit.epet.inherit;

public class TestPet {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.health=-1000;
		dog.love=3;
		dog.name="¶à¶à";
		dog.strain="¼ªÍÞÍÞ";
		dog.print();
		
		Penguin p=new Penguin();
		p.health=-1000;
		p.love=3;
		p.name="Q×Ð";
		p.sex="ÄÐ";
		p.print();
	}
}
