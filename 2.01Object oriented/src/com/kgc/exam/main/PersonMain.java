package com.kgc.exam.main;

import com.kgc.exam.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		//���� ������ = new ����();
		//ʵ����
		Person zhangsan = new Person();
		zhangsan.name = "����";
		zhangsan.age = 25;
		zhangsan.sex = '��';
		
		zhangsan.eat();
		
	}

}
