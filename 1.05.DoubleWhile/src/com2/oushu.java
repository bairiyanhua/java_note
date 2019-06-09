package com2;

// 100以内的偶数之和的四种写法
public class oushu {
	public static void main(String[] args) {
		// 第一种
		// int i=0;
		// int sum=0;
		// while(i<=100){
		// sum+=i;
		// i+=2;
		// }
		// System.out.println(sum);
		//

		// 第二种
		// int i=0;
		// int sum=0;
		// do{
		// sum+=i;i+=2;
		// }while(i<=100);
		// System.out.println(sum);
		//
		//
		// 第三种
		// int sum=0;
		// for(int i=0;i<=100;i+=2){
		// sum+=i;
		// }
		// System.out.println(sum);

		// 第四种
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

	}
}
