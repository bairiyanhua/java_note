﻿package jbit.io;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建 FileReader对象
		Reader fr=null;
		StringBuffer sbf=null;
		try {
			fr = new FileReader("C:\\myDoc\\简介.txt");
			char ch[]=new char[1024];  //创建字符数组作为中转站
			sbf=new StringBuffer();
			int length=-1; 
	        //将字符读入数组,循环读取并追加字符
	        while ((length=fr.read(ch))!= -1) { 
	            sbf.append(ch);   //追加到字符串
	        }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
   	    } finally{
			try {
				if(fr!=null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(sbf.toString());
	}

}
