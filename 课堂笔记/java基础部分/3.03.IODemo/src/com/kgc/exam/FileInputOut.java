package com.kgc.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileInputOut {

	 public static void main(String[] args) {
		 FileInputStream in = null;
		 FileOutputStream out = null;
		 try {
			//1. ��ʲô�ط���
			in = new FileInputStream("E:\\kgc\\aaa.txt");
			//2. �����ʲô�ط�ȥ
			out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\bbb.txt");
			//3. ������תվ���Ŷ�ȡ�����ļ�
			byte[] bytes = new byte[1024];
			//4. ����תվ�ж�������д��ȥ
			while(in.read(bytes) != -1){
				out.write(bytes);
			}
			System.out.println("���Ƴɹ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in!=null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(out!=null){
						out.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		 
		 
		 
		 
	}
}
