package com.kgc.exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _5BufferedReader {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			//创建一个FileReader对象，第一次从磁盘里面读取
			fr = new FileReader("E:\\kgc\\aaa.txt");
			//创建一个BufferedReader对象，把文件放入缓冲区
			br = new BufferedReader(fr);
			//从缓冲区里读，用readLine()方法，先读取第一行
			String text = br.readLine();
			while(text != null){
				System.out.println(text);
				//继续读取下一行的内容
				text = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(br!=null){
					br.close();
				}
				if(fr!=null){
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
