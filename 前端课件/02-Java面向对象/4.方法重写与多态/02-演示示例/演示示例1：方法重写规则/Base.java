
public class Base {
	public void method1(){
		System.out.println("�����ʵ������");
	}
	public static void method2(){
		System.out.println("����ľ�̬����");
	}
	public Base method3(){
		System.out.println("���෵��ֵ����Ϊbase�ķ���");
		return new Base();
	}
	
	private void method4(){
		System.out.println("�����˽�з���");
	}
}
