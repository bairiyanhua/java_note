package com.kgc.exam.thr;

public class A {
	
	public String aaa() throws ArithmeticException{
		B b = new B();
		String bbb = b.bbb();
		return "aaa"+bbb;
	}
	
	
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.aaa());
		
	}

}
