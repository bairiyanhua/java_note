package com.kgc.exam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _9DataInputAndOutStream {

	public static void main(String[] args) {
		//创建输入流对象，读
		FileInputStream in = null;
		DataInputStream din = null;
		
		//创建输出流对象，写
		FileOutputStream out = null;
		DataOutputStream dout = null;
		
		try {
			//读取文件
			in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\1.JPEG");
			din = new DataInputStream(in);
			
			//写文件
			out = new FileOutputStream("E:\\kgc\\2.JPEG");
			dout = new DataOutputStream(out);
			int temp;
			while((temp=din.read()) != -1){
				dout.write(temp);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(in!=null) in.close();
				if(out!=null) out.close();
				if(din!=null) din.close();
				if(dout!=null) dout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
	}
	
}
