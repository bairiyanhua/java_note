package cn.jbit.epet.override;
/**
 * 企鹅类，宠物的子类。
 * @author administrator 
 */
public class Penguin extends Pet {
	private String sex;// 性别
	/**
	 * 有参构造方法。
	 * @param name 昵称
	 * @param sex 性别
	 */
	public Penguin(String name, String sex) {
		super(name);
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}	
	
	public void print(){
		super.print();
		System.out.println("我的性别是"+this.getSex()+"。");
	}
	
    public void toHospital() {
        this.setHealth(70);
        System.out.println("吃药、疗养");
    }

}
