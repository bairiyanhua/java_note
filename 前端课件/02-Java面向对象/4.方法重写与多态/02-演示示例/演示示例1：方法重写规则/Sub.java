
public class Sub extends Base{
	//private void method1(){    //����Ȩ�޲������ڸ���
	//public static void method1(){    //����ķǾ�̬�������ܱ����า��Ϊ��̬����
	public void method1(){
		System.out.println("�����ʵ������");
	}
	
	//public void method2(){  //����ľ�̬�������ܱ����า��Ϊ�Ǿ�̬����
	//������Զ����븸��ͬ���ľ�̬�������Ա���������"����"����ľ�̬����
	public static void method2(){
		System.out.println("����ľ�̬����");
	}
	
	//����ֵ������ͬ������������
	public Sub method3(){
		System.out.println("���෵��ֵΪSub�ķ���");
		return new Sub();
	}
	
	//�����˽�з������ܱ����า��,����д���ԣ������Ƕ����ķ���
	public void method4(){
		System.out.println("�����˽�з���");
	}
}
