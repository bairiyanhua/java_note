package DuoBianXing;

import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��10���ڵ�����");
		int num=input.nextInt();
		for (int i = 1; i <= num; i++) {
			// j:�հ�
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			// j:ÿһ�������ǵĸ���������
			for (int j = 1; j <= i; j++) {
				System.out.print(i-j+1);
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(j+1);
			}
			// ÿһ�����������Ϻ�Ҫ����
			System.out.println();
		}
	}

}
