package com.kgc.exam;

import java.util.Scanner;

public class Dome5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//���嶩����������
		String[] names = new String[4]; //������
		String[] foods = new String[4]; //��Ʒ��Ϣ
		int[] times = new int[4]; //�Ͳ�ʱ��
		String[] address = new String[4]; //�Ͳ͵�ַ
		double[] moneys = new double[4]; //�ܽ��
		int[] status = new int[4]; //����״̬ 0-��Ԥ�� 1-�����
		
		names[0] = "����";
		foods[0] = "��С��";
		times[0] = 8;
		address[0] = "�Ķ�16¥";
		moneys[0] = 40.0;
		status[0] = 0;
		
		//��Ʒ��Ϣ
		String[] dishname = {"���㼦","��С��","��ˮѼ","��˿��"};
		double[] price = {18.0, 40.0, 45.0, 10.0};
		int[] good = new int[4];
		
		int num = 0; //�ж�ѭ��������
		boolean isGo = false; //�ж��Ƿ��˳�������
		System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
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
				boolean isFull = true; //�жϲʹ��Ƿ�������Ĭ����
				for (int i = 0; i < names.length; i++) {
					if(names[i] == null){
						isFull = false;
						System.out.print("�����붩���˵�������");
						String name = input.next();
						
						System.out.println("���\t����\t����");
						for (int j = 0; j < dishname.length; j++) {
							System.out.println((j+1) + "\t" + dishname[j] + "\t" + price[j]);
						}
						
						System.out.print("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
						int ord = input.nextInt();
						
						System.out.print("��ѡ������Ҫ�ķ�����");
						int count = input.nextInt();
						
						System.out.print("�������Ͳ�ʱ��(�Ͳ�ʱ����10����20��������Ͳ�):");
						int time = input.nextInt();
						
						while(time<10 || time>20){
							System.out.print("�Բ��𣬸�ʱ������ˣ����Ͳͣ����������룺");
							time = input.nextInt();
						}
						
						System.out.print("�������Ͳ͵�ַ��");
						String addr = input.next();
						
						System.out.println("���ͳɹ���");
						System.out.println("�������ǣ�" + dishname[ord-1] + "  "+count+"��");
						System.out.println("�Ͳ�ʱ�䣺" + time + "��");
						
						double canfei = price[ord-1] * count;
						double song = canfei >=50 ? 0.0 : 6.0;
						
						System.out.println("�ͷ�" + canfei + "���Ͳͷѣ�"+song+"���ܼƣ�" + (canfei+song));
						
						names[i] = name;
						foods[i] = dishname[ord-1];
						times[i] = time;
						address[i] = addr;
						moneys[i] = canfei+song;
						status[i] = 0;
						
						break;
					}
				}
				if(isFull){
					System.out.println("�ʹ�����");
				}
				break;
			case 2:
				System.out.println("---�鿴�ʹ�---");
				System.out.println("���\t������\t��Ʒ��Ϣ\t�Ͳ�ʱ��\t�Ͳ͵�ַ	\t�ܽ��\t����״̬");
				for (int i = 0; i < names.length; i++) {
					if(names[i] != null){
						System.out.println((i+1)+"\t"+names[i]+"\t"+foods[i]+"\t"+times[i]+"\t"+address[i]+"\t\t"+moneys[i]+"\t"+(status[i]==0?"��Ԥ��":"�����"));
					}
				}
				break;
			case 3:
				System.out.println("---ǩ�ն���---");
				System.out.print("��ѡ��Ҫǩ�յĶ�����ţ�");
				int order = input.nextInt();
				//�ȸ�������ж���û���������
				//���û�У�������ʾ;����У��ٿ����������״̬�ǲ�����Ԥ��(0)��������ǣ�������ʾ
				if(names[order-1] == null){
					System.out.println("��ѡ��Ķ��������ڣ�");
				}else{
					if(status[order-1] == 0){
						status[order-1] = 1;
						System.out.println("ǩ�ճɹ���");
					}else if(status[order-1] == 1){
						System.out.println("��ѡ��Ķ�����ǩ�գ������ظ�ǩ�գ�");
					}
				}
				break;
			case 4:
				System.out.println("---ɾ������---");
				System.out.print("��ѡ��Ҫɾ���Ķ�����ţ�");
				int del = input.nextInt();
				if(names[del-1]==null){
					System.out.println("��ѡ��Ķ��������ڣ�");
				}else{
					if(status[del-1] == 0){
						System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
					}else if(status[del-1] == 1){
						names[del-1] = null;
						foods[del-1] = null;
						times[del-1] = 0;
						address[del-1] = null;
						moneys[del-1] = 0.0;
						status[del-1] = 0;
						System.out.println("ɾ���ɹ���");
					}
				}
				break;
			case 5:
				System.out.println("---��Ҫ����---");
				System.out.println("���\t����\t����");
				for (int i = 0; i < dishname.length; i++) {
					System.out.println((i+1) + "\t" + dishname[i] + "\t" + price[i] + "\t" + good[i] + "��");
				}
				System.out.print("��ѡ����Ҫ���޵Ĳ�Ʒ��ţ�");
				int goodNum = input.nextInt();
				good[goodNum-1] += 1;
				System.out.println("���޳ɹ���");
				break;
			case 6:
				System.out.println("---�˳�ϵͳ---");
				isGo = true;
				break;
			default:
				System.out.println("�������ϵͳ�˳�");
				isGo = true;
				break;
			}
			
			if(isGo){
				System.out.println("ллʹ�ã�");
				break;
			}else{
				System.out.println("����0����");
				num = input.nextInt();
			}
			
		} while (num == 0);
		
	}

}
