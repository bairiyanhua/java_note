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
			//1. 从什么地方读
			in = new FileInputStream("E:\\kgc\\aaa.txt");
			//2. 输出到什么地方去
			out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\bbb.txt");
			//3. 设置中转站，放读取到的文件
			byte[] bytes = new byte[1024];
			//4. 从中转站中读到数据写出去
			while(in.read(bytes) != -1){
				out.write(bytes);
			}
			System.out.println("复制成功");
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
