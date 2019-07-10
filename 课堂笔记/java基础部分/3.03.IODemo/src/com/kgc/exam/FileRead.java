package com.kgc.exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			//1. 从什么地方读
			fr = new FileReader("E:\\kgc\\aaa.txt");
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\ddd.txt");
			
			//2. 创建一个字符中转站
			char[] chars = new char[1024];
			
			while(fr.read(chars) != -1){
				fw.write(chars);
			}
//			fw.flush();  //在关闭之前会自动执行
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) { fr.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(fw != null) { fw.close(); }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
	}

}
