package com.kgc.exam;

public class Visitor {
	
	public String name;
	public int age;
	
	public void show(){
		if(age >= 10){
			System.out.println(name + "�������ǣ�" + age + ",��Ʊ�۸�Ϊ20Ԫ");
		}else{
			System.out.println(name + "�������ǣ�" + age + ",��Ʊ�۸�Ϊ10Ԫ");
		}
	}
	

}
