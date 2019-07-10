package cn.jbit.epet.override;

/**
 * 狗狗类，宠物的子类。
 * @author administrator
 */
public class Dog extends Pet {
	private String strain="吉娃娃";// 品种
	
	public Dog(){}

	/**
	 * 有参构造方法。
	 * @param name   昵称
	 * @param strain   品种
	 */
	public Dog(String name, String strain) {
		super(name); 
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
	
	public void toHospital() {
        this.setHealth(60);
        System.out.println("打针、吃药");
    }
	
	/**
	 * 实现吃食方法。 
	 */
	public void eat() {
		if(getHealth()>=100){
			System.out.println("狗狗"+this.getName() +"吃饱了，不需要喂食了！");
		}else{
			this.setHealth(this.getHealth()+3);
			System.out.println("狗狗"+this.getName() + "吃饱啦！健康值增加3。");
		}
	}
}
