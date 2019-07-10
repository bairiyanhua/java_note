package com.kgc.exam;

import java.io.FileWriter;
import java.io.IOException;

public class _6FileWriter {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\ccc.txt");
			fw.write("我爱你中国，我爱你故乡");
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fw!=null){
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
