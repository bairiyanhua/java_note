package extendAnimal;
//测试类
public class Test {
	public static void main(String[] args) {
		// 1、创建宠物对象pet并输出信息
		Pet pet = new Pet("贝贝");
		pet.print();
		/*// 2、创建狗狗对象dog并输出信息
		Dog dog = new Dog();
		dog.setName("多多");
		dog.setHealth(90);
		dog.setLove(80);
		dog.setStrain("吉娃娃");
		dog.print();
		// 3、创建企鹅对象pgn并输出信息
		Penguin pgn = new Penguin();
		pgn.setName("大黑");
		pgn.setHealth(98);
		pgn.setLove(99);
		pgn.setSex("Q妹");
		pgn.print();*/
		
		Dog dog=new Dog("多多","吉娃娃");
		dog.print();
		Penguin pgn = new Penguin("大黑","Q妹");
		dog.print();
	}
}
