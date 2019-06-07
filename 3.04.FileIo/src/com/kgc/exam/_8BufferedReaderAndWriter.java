package com.kgc.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _8BufferedReaderAndWriter {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("E:\\kgc\\pet.template");
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\pet.txt");
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			String text = br.readLine();
			StringBuffer sb = new StringBuffer();
			while(text != null){
				sb.append(text);
				text = br.readLine();
			}
			System.out.println("读取前："+sb.toString());
			
//			String newStr = sb.toString().replace("{name}", "欧欧");
//			newStr = newStr.replace("{type}", "狗狗");
//			newStr = newStr.replace("{master}", "李伟");
			String newStr = sb.toString().replace("{name}", "欧欧").replace("{type}", "狗狗").replace("{master}", "李伟");
			System.out.println("替换后："+newStr);
			bw.write(newStr);
			bw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(bw!=null){
					bw.close();
				}
				if(fw!=null){
					fw.close();
				}
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
