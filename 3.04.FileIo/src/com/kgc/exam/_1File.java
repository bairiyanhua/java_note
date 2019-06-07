package com.kgc.exam;

import java.io.File;
import java.io.IOException;

public class _1File {
	public static void main(String[] args) {
		_1File aa = new _1File();
		
		File file = new File("aaa.txt");
		aa.create(file);
//		aa.delete(file);
//		aa.showMsg(file);
	}
	
	/**
	 * 创建一个文件
	 */
	public void create(File file){
		if(!file.exists()){
			try {
				file.createNewFile();
				System.out.println("创建成功！");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 删除文件
	 * @param file
	 */
	public void delete(File file){
		if(file.exists()){
			file.delete();
			System.out.println("删除成功");
		}else{
			System.out.println("文件不存在");
		}
	}
	
	/**
	 * 显示文件信息
	 * @param file
	 */
	public void showMsg(File file){
		if(file.exists()){
			System.out.println(file.getName());
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
		}
	}
	

}
