package com.kgc.exam.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String aa = "�Ұ����й����Ұ������";
		
		//����
//		System.out.println(aa.length());
		
		//�Ƿ�Ϊ�� ��ֵΪnull��ʱ��û���жϣ�����ֿ�ָ���쳣
//		System.out.println(aa.isEmpty());
		
		//ͨ���±��ҵ���Ӧ���ַ�
//		System.out.println(aa.charAt(5));
		
		//���ַ������byte��������
//		byte[] str = aa.getBytes();
//		aa = new String(aa.getBytes("gbk"), "iso-8859-1");
//		System.out.println(aa);
		
		//�Ƿ���ָ���ַ�����ͷ
//		System.out.println(aa.startsWith("�Ұ�"));
		
		//�Ƿ���ָ���ַ�����β
//		System.out.println(aa.endsWith("��"));
		
		//�ҵ�ָ���ַ�����һ�γ��ֵ�λ�ã����û�У�����-1
//		System.out.println(aa.indexOf("��"));
		
		//�ҵ�ָ���ַ������һ�γ��ֵ�λ��
//		System.out.println(aa.lastIndexOf("��"));
		
		//��ȡ�ַ����������һ��ֵ���ͽ�ȡ������ָ���±����������
		//���������ֵ���ͽ�ȡ������ֵ֮����ַ�����������һ���±�ָ�����ַ�
//		System.out.println(aa.substring(5, 8));
		
		//ƴ���ַ���
		// + �� concat ������
		// + ƴ�ӿ������κλ�����������
		// concat ƴ��ֻ�����ַ���
//		System.out.println(aa.concat("aaaaa"));
		
		//�滻
//		System.out.println(aa.replace("��", "&&"));
//		System.out.println(aa.replaceAll("����", "%%"));
		
		//ͨ��ָ���ַ����ַ�����ֳ�һ������
		String[] bb = aa.split("");
		System.out.println(Arrays.toString(bb));
		
		//��дСд֮��ת��
//		String bb = "AbCdEf";
//		System.out.println(bb.toLowerCase());
//		System.out.println(bb.toUpperCase());
		
		//ȥǰ��ո�, �м�Ŀո�ȥ����
//		System.out.println(aa.trim());
		
		
		
		
		
	}
}
