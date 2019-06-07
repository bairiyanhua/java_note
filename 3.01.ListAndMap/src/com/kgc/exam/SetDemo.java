package com.kgc.exam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set set = new HashSet();
		//增加  add()
		set.add(1);
		set.add(true);
		set.add("张三");
		set.add("李四");
		set.add("王五");
		set.add("赵六");
		set.add("鬼脚七");
		
		//删除
		set.remove("张三");
		
		
		//获取  循环
		for (Object object : set) {
			String aa = (String)object;
			System.out.println(aa);
		}
		
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			String val = (String)it.next();
			System.out.println(val);
		}
		
		
	}

}
