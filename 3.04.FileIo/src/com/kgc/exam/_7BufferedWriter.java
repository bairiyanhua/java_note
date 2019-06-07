package com.kgc.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _7BufferedWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			//写文件
			fw = new FileWriter("E:\\kgc\\bbb.txt");
			bw = new BufferedWriter(fw);
			bw.write("我爱你");
			bw.write("中国");
			bw.newLine();
			bw.write("我爱你，故乡！");
			bw.flush();
			
			//读取文件内容
	        fr=new FileReader("E:\\kgc\\bbb.txt"); 
	        br=new BufferedReader(fr); 
	        String line=br.readLine();
	        while(line!=null){ 
	            System.out.println(line);
	            line=br.readLine(); 
	        }
			
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
