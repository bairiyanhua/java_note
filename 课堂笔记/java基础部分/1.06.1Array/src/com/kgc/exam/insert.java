package com.kgc.exam;

import java.util.Scanner;

public class insert {
	//��һ��ѧԱ�ĳɼ�{99,85,82,63,60},�����ǰ��������С�
	//Ҫ����һ��ѧԱ�ĳɼ�����������ɼ����У������ֽ���
	public static void main(String[] args) {
	int nums[]=new int[6];
	nums[0]=99;
	nums[1]=85;
	nums[2]=82;
	nums[3]=63;
	nums[4]=60;
		
	Scanner input=new Scanner(System.in);
	System.out.println("������Ҫ�������ֵ��");
	int num=input.nextInt();
	//��num���뵽nums��indexλ��
	int index=nums.length-1;
	
	//���û���������ݺ������е���������αȽϣ�֪������һ������С����ֵΪֹ
	for(int i=0;i<nums.length;i++){
		if(num>nums[i]){
			break;
		}
	}
	//��ԭ��Ϊֹ����ֵ���������ƶ��������յأ�������ֵ
	for(int j=nums.length-1;j>index;j--){
		nums[j]=nums[j-1];
	}
	nums[index]=num;
	System.out.println("����ɼ����±��ǣ�"+index);
	System.out.println("������������Ԫ�����£�");
	for(int num1:nums){
		System.out.println(num1+"\t");
	}
	}
	
	}


