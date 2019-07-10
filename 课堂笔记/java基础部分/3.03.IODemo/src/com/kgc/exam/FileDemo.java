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
			if(!file.exists()){ //判断文件存不存在，如果不存在，创建
				boolean flag = file.createNewFile(); //创建
				if(flag){
					System.out.println("创建成功！");
				}else{
					System.out.println("创建失败！");
				}
			}else{
				System.out.println("文件已存在");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void del(){
		if(file.exists()){
			boolean flag = file.delete(); //删除文件
			if(flag){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		}else{
			System.out.println("文件不存在！");
		}
	}
	
	public void isFileAndDirectory(){
		if(file.exists()){
			if(file.isFile()){
				System.out.println("这是一个文件");
			}else if(file.isDirectory()){
				System.out.println("这是一个文件夹");
			}else{
				System.out.println("这不是一个文件也不是一个文件夹");
			}
		}else{
			System.out.println("目标不存在");
		}
	}
	
	public void getPath(){
		if(file.exists()){
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getName());
			System.out.println(file.length());
		}else{
			System.out.println("目标不存在");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
