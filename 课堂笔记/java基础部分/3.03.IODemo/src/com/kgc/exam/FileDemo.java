package com.kgc.exam;

import java.io.File;
import java.io.IOException;

public class FileDemo {

//	public String aa = new String("123456");
	
	public static void main(String[] args) {
		FileDemo demo = new FileDemo();
//		demo.create();
//		demo.del();
//		demo.isFileAndDirectory();
		demo.getPath();
	}
	
	
	
	public File file = new File("aaa.txt");
	
	public void create(){
		try { 
			if(!file.exists()){ //�ж��ļ��治���ڣ���������ڣ�����
				boolean flag = file.createNewFile(); //����
				if(flag){
					System.out.println("�����ɹ���");
				}else{
					System.out.println("����ʧ�ܣ�");
				}
			}else{
				System.out.println("�ļ��Ѵ���");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void del(){
		if(file.exists()){
			boolean flag = file.delete(); //ɾ���ļ�
			if(flag){
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ�ܣ�");
			}
		}else{
			System.out.println("�ļ������ڣ�");
		}
	}
	
	public void isFileAndDirectory(){
		if(file.exists()){
			if(file.isFile()){
				System.out.println("����һ���ļ�");
			}else if(file.isDirectory()){
				System.out.println("����һ���ļ���");
			}else{
				System.out.println("�ⲻ��һ���ļ�Ҳ����һ���ļ���");
			}
		}else{
			System.out.println("Ŀ�겻����");
		}
	}
	
	public void getPath(){
		if(file.exists()){
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.length());
		}else{
			System.out.println("Ŀ�겻����");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
