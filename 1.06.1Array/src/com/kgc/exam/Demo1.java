package com.kgc.exam;

public class Demo1 {
	public static void main(String[] args) {
		//定义数组
		//1.声明变量并分配空间，然后通过下标赋值和取值，下标是从0开始
		int[] scores = new int[30];
		//通过下标赋值
		scores[0] = 25;
		scores[1] = 30;
		scores[2] = 35;
		scores[3] = 40;
		scores[4] = 45;
		
		//通过下标取值
		int aa = scores[4];
		
		//2.在声明数组的同时给数组赋值
		int[] nums = {2,3,4,5,6,7};
//		int bb[] = {1,2,3}; //[]的位置是可以放在后面的
		
		String[] names = new String[]{"张三","李四","王五","赵六"}; 
		
		
	}

}
