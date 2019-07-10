package cn.jbit.epet.inherit;

import java.util.Scanner;

public class GoodLuck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入四位数的会员号：");
		int no = input.nextInt();
		int gewei = no%10;
		System.out.println("您会员号的各位数字："+gewei);
		String info = (gewei%2==0)?"恭喜您，中奖了！":"谢谢参与！";
		System.out.println(info);
	}
}
