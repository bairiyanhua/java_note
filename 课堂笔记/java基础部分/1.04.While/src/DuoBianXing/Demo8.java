package DuoBianXing;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个10以内的整数");
		int num=input.nextInt();
		for (int i = 1; i <= num; i++) {
			// j:空白
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			// j:每一行中星星的个数，列数
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1);
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(j+1);
			}
			// 每一行星星输出完毕后要换行
			System.out.println();
		}
	}

}
