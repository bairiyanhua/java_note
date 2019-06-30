package extendAnimal;
/**
 * 企鹅类，宠物的子类
 */
public class Penguin extends Pet {
	private String sex="Q仔";// 性别

	//无参构造方法
	public Penguin() {
		System.out.println("子类无参构造方法");
	}
	
	public Penguin(String name,String sex){
		super(name);
		this.sex=sex;
		System.out.println("子类带参构造方法");
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
}
