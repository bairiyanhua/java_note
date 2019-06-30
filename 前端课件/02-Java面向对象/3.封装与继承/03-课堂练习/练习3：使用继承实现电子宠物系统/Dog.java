package extendAnimal;
/**
 * 狗狗类，宠物的子类
 */
public class Dog extends Pet {
	private String strain="牧羊犬";// 品种

	//无参构造方法
	public Dog() {
		System.out.println("子类无参构造方法");
	}
	
	public Dog(String name,String strain){
		super(name);
		this.strain=strain;
		System.out.println("子类带参构造方法");
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}

