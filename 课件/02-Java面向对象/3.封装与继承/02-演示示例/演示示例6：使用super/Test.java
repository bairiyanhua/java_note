package extendAnimal;
//������
public class Test {
	public static void main(String[] args) {
		// 1�������������pet�������Ϣ
		Pet pet = new Pet("����");
		pet.print();
		/*// 2��������������dog�������Ϣ
		Dog dog = new Dog();
		dog.setName("���");
		dog.setHealth(90);
		dog.setLove(80);
		dog.setStrain("������");
		dog.print();
		// 3������������pgn�������Ϣ
		Penguin pgn = new Penguin();
		pgn.setName("���");
		pgn.setHealth(98);
		pgn.setLove(99);
		pgn.setSex("Q��");
		pgn.print();*/
		
		Dog dog=new Dog("���","������");
		dog.print();
		Penguin pgn = new Penguin("���","Q��");
		dog.print();
	}
}
