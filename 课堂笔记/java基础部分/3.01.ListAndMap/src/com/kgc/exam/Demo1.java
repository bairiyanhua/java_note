package com.kgc.exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Demo1 {
	
	public static void main(String[] args) {
		
		List aa = new ArrayList();
//		List aa = new LinkedList();
		//增加  add()
		aa.add(1);
		aa.add(true);
		aa.add('a');
		aa.add("王五");
		aa.add("赵六");
		aa.add("鬼脚七");
		
		//获取/查  get()
		System.out.println(aa.get(0));
		
		//长度  size()
		System.out.println(aa.size());
		
		//删除  remove()
		aa.remove(0);
		aa.remove("李四");
		
		//修改 set()
		aa.set(0, "aaaaa");
		
		System.out.println(aa.get(0));
		
		//是否包含
		System.out.println(aa.contains("aaaaa"));
		
		
		//遍历集合
		for (int i = 0; i < aa.size(); i++) {
			System.out.print(aa.get(i) + " == ");
		}
		
	}

}
