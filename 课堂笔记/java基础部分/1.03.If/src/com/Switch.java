package com;

public class Switch {
	public static void main(String[] args) {
		
		int mingci = 1;
		
		/*if(mingci == 1){
			System.out.println("��һ��");
		}else if(mingci == 2){
			System.out.println("�ڶ���");
		}else if(mingci == 3){
			System.out.println("������");
		}else{
			System.out.println("�������⣬û����");
		}*/
		switch(mingci){
			case 1:
				System.out.println("��һ��");
				break;
			case 2:
				System.out.println("�ڶ���");
				break;
			case 3:
				System.out.println("������");
				break;
			default:
				System.out.println("�������⣬û����");
				break;
		}
		
		
		
	}
}
