package test;

import java.util.Scanner;

public class NumJudge {
	/**
	 * 判断一个数字是否为偶数
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个数字：");
		int num=input.nextInt();
		String result=(num%2==0)?"偶数":"奇数";
		System.out.println(num+"是"+result);
	}

}
