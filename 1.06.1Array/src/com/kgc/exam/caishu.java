package com.kgc.exam;

import java.util.Scanner;
//猜数

public class caishu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nums[] = { 31, 44, 56, 7, 23, 3 };
		// 标识：记录用户是否猜对了数字 true猜对了，false猜错了
		boolean flag = false;
		int guess = input.nextInt();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == guess) {
				// 猜对了，for循环就不用往后了
				flag = true;
				break;
			}

		}
		if (flag) {
			System.out.println("恭喜，猜对了！");
		} else {
			System.out.println("对不起，没猜中！");
		}

	}

}