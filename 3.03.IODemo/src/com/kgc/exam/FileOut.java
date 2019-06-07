package com.kgc.exam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
	
	public static void main(String[] args) {
		
		FileOutputStream out = null;
		
		try {
			out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\ccc.txt");
			
			String aa = "好好学习\n天天向上";
			
			byte[] str = aa.getBytes();
			
			out.write(str, 0, str.length);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null){
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
