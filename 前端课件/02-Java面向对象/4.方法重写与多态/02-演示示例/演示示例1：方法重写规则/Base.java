
public class Base {
	public void method1(){
		System.out.println("父类的实例方法");
	}
	public static void method2(){
		System.out.println("父类的静态方法");
	}
	public Base method3(){
		System.out.println("父类返回值类型为base的方法");
		return new Base();
	}
	
	private void method4(){
		System.out.println("父类的私有方法");
	}
}
