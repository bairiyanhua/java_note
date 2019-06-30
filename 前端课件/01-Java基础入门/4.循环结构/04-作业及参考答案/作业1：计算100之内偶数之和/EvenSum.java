package com.bdqn;

public class EvenSum {

	/*
	 * 计算100以内偶数之和
	 * 思考：还有没有其他方式？
	 */
	public static void main(String[] args) {
		//使用while
		/*int sum = 0;	//当前之和
		int num = 2;	//加数
		while(num <= 100){
			sum = sum + num;	//累加
			num = num + 2;
		}
		System.out.println("100以内的偶数之和为：" + sum);*/
		
		//使用do-while
		/*int sum = 0;	//当前之和
		int num = 2;	//加数
		do{
			sum = sum + num;	//累加
			num = num + 2;
		}while(num <= 100);
		System.out.println("100以内的偶数之和为：" + sum);*/
		
		//使用for
		int sum = 0;	//当前之和
		for(int num=2;num<=100;num=num+2){
			sum = sum + num;	//累加
		}
		System.out.println("100以内的偶数之和为：" + sum);
	}
}
