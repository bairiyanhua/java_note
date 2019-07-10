package com.kgc.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _4FileReader {
	public static void main(String[] args) {
		//创建 FileReader对象对象.
		FileReader reader = null;
		StringBuffer sb = new StringBuffer();
		try {
			reader = new FileReader("E:\\kgc\\aaa.txt");
			//创建字符数组作为中转站
			char[] chars = new char[1024];
			//将字符读入数组
			int length = reader.read(chars);
			while(length != -1){
				//追加到字符串
				sb.append(chars);
				length = reader.read();
			}
			System.out.println(sb.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null){
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
