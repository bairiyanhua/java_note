package com.kgc.exam.main;

public class Entity {
	
	public static String name;
	public String pwd;

	static{
		System.out.println("这里是代码块");
	}
	
	public Entity(){
		System.out.println("构造方法");
	}
	
	public static void show(){
		System.out.println("aaaaaaaaaaaaaaaaaaf");
	}
	
}
