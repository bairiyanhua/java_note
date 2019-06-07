package com.kgc.exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _2FileInputOut {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			//1、创建输入流,负责读取E:\\kgc\\aaa.txt文件
			in = new FileInputStream("E:\\kgc\\aaa.txt");
			//2、创建输出流对象
			out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\bbb.txt");
			//3、创建中转站数组,存放每次读取的内容
			byte[] bytes = new byte[1024];
			//4、通过循环实现文件读取
			while(in.read(bytes) != -1){
				out.write(bytes);
			}
			System.out.println("复制完成，请查看文件！");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}
