package extendAnimal;
/**
 * 狗狗类，宠物的子类
 */
public class Dog extends Pet {
	private String strain="牧羊犬";// 品种

	//无参构造方法
	public Dog() {
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	
}

