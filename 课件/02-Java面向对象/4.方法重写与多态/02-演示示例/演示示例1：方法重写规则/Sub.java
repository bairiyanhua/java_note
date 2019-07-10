
public class Sub extends Base{
	//private void method1(){    //访问权限不能严于父类
	//public static void method1(){    //父类的非静态方法不能被子类覆盖为静态方法
	public void method1(){
		System.out.println("子类的实例方法");
	}
	
	//public void method2(){  //父类的静态方法不能被子类覆盖为非静态方法
	//子类可以定义与父类同名的静态方法，以便在子类中"隐藏"父类的静态方法
	public static void method2(){
		System.out.println("子类的静态方法");
	}
	
	//返回值类型相同或者是其子类
	public Sub method3(){
		System.out.println("子类返回值为Sub的方法");
		return new Sub();
	}
	
	//父类的私有方法不能被子类覆盖,这样写可以，但是是独立的方法
	public void method4(){
		System.out.println("子类的私有方法");
	}
}
