package test;

import java.util.Scanner;

public class NumJudge {
	/**
	 * �ж�һ�������Ƿ�Ϊż��
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("������һ�����֣�");
		int num=input.nextInt();
		String result=(num%2==0)?"ż��":"����";
		System.out.println(num+"��"+result);
	}

}
