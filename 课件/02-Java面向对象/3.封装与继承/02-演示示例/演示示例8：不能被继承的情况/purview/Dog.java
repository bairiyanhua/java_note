package cn.jbit.epet.purview;

/**
 * 狗狗类，宠物的子类。
 * @author administrator
 */
public class Dog extends Pet {
	private String strain;// 品种

	/**
	 * 有参构造方法。
	 * @param name   昵称
	 * @param strain   品种
	 */
	public Dog(String name, String strain) {
		super(name); //此处不能使用this.name=name;
		this.strain = strain;
	}
	
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	
	public void print(){
		super.print();
		System.out.println("我是一只"+this.getStrain()+"犬。");
	}
	
	/**
	 * 测试不能被继承的情况 
	 */
	public void test(){
		//System.out.println(name); // 不能继承private成员
		System.out.println(color); // 同包下，可以继承protected成员
		System.out.println(avoirdupois);  //同包下，子类可以继承默认访问权限的成员
		System.out.println(id);// 同包下，可以继承public成员
	}
}
