package com.kgc.exam;

public class Visitor {
	
	public String name;
	public int age;
	
	public void show(){
		if(age >= 10){
			System.out.println(name + "的年龄是：" + age + ",门票价格为20元");
		}else{
			System.out.println(name + "的年龄是：" + age + ",门票价格为10元");
		}
	}
	

}
