package test;

public class TestChange {
	public static void main(String[] args) {
		int num1=5;
		int num2=6;
		System.out.println("����ǰ��");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("������");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}
