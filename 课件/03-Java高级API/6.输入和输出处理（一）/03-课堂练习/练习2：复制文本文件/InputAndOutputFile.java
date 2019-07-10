package jbit.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutputFile {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			//1、创建输入流对,负责读取D:/ 我的青春谁做主.txt文件
			fis = new FileInputStream("D:/我的青春谁做主.txt");
			//2、创建输出流对象
			fos = new FileOutputStream("C:/myFile/myPrime.txt",true);
			//3、创建中转站数组,存放每次读取的内容
			byte[] words=new byte[1024];
			//4、通过循环实现文件读取
			int len = -1;
			while((len = fis.read(words))!=-1){
				fos.write(words, 0, len);
			}
			fos.flush();
			System.out.println("复制完成，请查看文件！");		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//5、关闭流
	        try {
	        	if(fos!=null)
	        		fos.close();
	        	if(fis!=null)
	        		fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
