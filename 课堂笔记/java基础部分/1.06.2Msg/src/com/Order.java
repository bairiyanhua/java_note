package com;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//6��������Ϣ����
		String[] names = new String[4]; //������
		String[] menus = new String[4]; //��Ʒ
		int[] times = new int[4]; //�Ͳ�ʱ��
		String[] address = new String[4]; //�Ͳ͵�ַ
		double[] price = new double[4]; //�ܽ��
		int[] status = new int[4]; //����״̬ 1-�����   0-��Ԥ��
		
		//3���˵�����
		String[] menuName = {"���㼦","��С��","��ˮѼ","��˿��"};
		double[] moneys = {18.0, 40.0, 45.0, 10.0};
		int[] good = new int[4];
		
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
		
		int num = 0; //ѭ������
		boolean isExit = false; //�ж��Ƿ��˳�ϵͳ��Ĭ�ϲ��˳�
		
		do {
			System.out.println("***************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("***************************");
			System.out.print("��ѡ��");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("---��Ҫ����---");
				boolean isFull = true; //�жϲʹ��Ƿ�����
				int i = 0;
				for (i=0; i < names.length; i++) {
					if(names[i] == null){
						isFull = false;
						break;
					}
				}
				if(isFull){
					System.out.println("���Ĳʹ��������޷��������ͣ�");
				}else{
					System.out.print("�����붩���˵�������");
					String name = input.next();
					
					System.out.println("���\t����\t����");
					for (int j = 0; j < menuName.length; j++) {
						System.out.println((j+1)+"\t"+menuName[j]+"\t"+moneys[j]+"Ԫ");
					}
					System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
					int order = input.nextInt();
					
					System.out.print("��ѡ������Ҫ�ķ�����");
					int count = input.nextInt();
					
					System.out.print("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20��������Ͳͣ�:");
					int time = input.nextInt();
					while (time<10 || time >20) {
						System.out.print("�Բ��𣬸�ʱ������ˣ����Ͳͣ����������룺");
						time = input.nextInt();
					}
					
					System.out.print("�������Ͳ͵�ַ��");
					String addr = input.next();
					
					System.out.println("���ͳɹ���");
					System.out.println("�������ǣ�"+menuName[order-1] + " " + count+"��");
					System.out.println("�Ͳ�ʱ�䣺" + time + "��");
					
					//�ܽ��=����*����
					double totalMoney = moneys[order-1] * count;
					
					//�Ͳͷѡ�����ܽ��>=50�����Ͳͷ�
					double song = totalMoney >= 50.0 ? 0.0 : 6.0;
					
					System.out.println("�ͷѣ�"+totalMoney + "�� �Ͳͷѣ�"+song+"�� �ܼƣ�"+(totalMoney+song));
					
					//�����еĶ�����Ϣ�����Ӧ����
					names[i] = name;
					menus[i] = menuName[order-1];
					times[i] = time;
					address[i] = addr;
					price[i] = totalMoney+song;
					status[i] = 0;
				}
				break;
			case 2:
				System.out.println("---�鿴�ʹ�---");
				System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ	\t�ܽ��\t����״̬");
				for (int j = 0; j < names.length; j++) {
					if(names[j] != null){
						System.out.println((j+1)+"\t"+names[j]+"\t"+menus[j]+"\t"+times[j]+"\t"+address[j]+"\t\t"+price[j]+"\t"+(status[j]==0?"��Ԥ��":"�����"));
					}
				}
				break;
			case 3:
				System.out.println("---ǩ�ն���---");
				System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
				int order = input.nextInt();
				if(names[order-1] == null){
					System.out.println("��ѡ��Ķ��������ڣ�");
				}else{
					if(status[order-1] == 1){
						System.out.println("��ѡ��Ķ��������ǩ�գ������ٴ�ǩ�գ�");
					}else{
						System.out.println("ǩ�ճɹ���");
						status[order-1] = 1;
					}
				}
				break;
			case 4:
				System.out.println("---ɾ������---");
				System.out.print("��ѡ��Ҫɾ���Ķ�����ţ�");
				int del = input.nextInt();
				if(names[del-1] == null){
					System.out.println("��ѡ��Ķ��������ڣ�");
				}else{
					if(status[del-1] == 0){
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
					}else{
						names[del-1] = null;
						menus[del-1] = null;
						times[del-1] = 0;
						address[del-1] = null;
						price[del-1] = 0.0;
						status[del-1] = 0;
						System.out.println("ɾ���ɹ�");
					}
				}
				break;
			case 5:
				System.out.println("---��Ҫ����---");
				System.out.println("���\t����\t����");
				for (int j = 0; j < menuName.length; j++) {
					System.out.println((j+1)+"\t"+menuName[j]+"\t"+moneys[j]+"\t"+good[j]+"��");
				}
				System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int goodNum = input.nextInt();
				good[goodNum-1] += 1;
				System.out.println("���޳ɹ���");
				break;
			case 6:
				System.out.println("---�˳�ϵͳ---");
				System.out.println("��лʹ�ã�");
				isExit = true;
				break;
			default:
				System.out.println("û�д�ѡ�������ѡ��");
				break;
			}
			
			if(!isExit){
				System.out.println("����0����");
				num = input.nextInt();
			}else{
				break;
			}
		} while (num == 0);
		
		
		
	}
	
	

}
