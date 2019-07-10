package com.kgc.exam.main;

import com.kgc.exam.Person;

public class PersonMain {
	
	public static void main(String[] args) {
		
		//类名 对象名 = new 类名();
		//实例化
		Person zhangsan = new Person();
		zhangsan.name = "张三";
		zhangsan.age = 25;
		zhangsan.sex = '男';
		
		zhangsan.eat();
		
	}

}
