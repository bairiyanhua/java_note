import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args){
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("d:\\myDoc\\hello.txt",true);
			String str="�ú�ѧϰJava";
			byte[] words=str.getBytes();
			fos.write(words,0,words.length);
			System.out.println("hello�ļ��Ѹ���");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("�ļ�����ʱ����");
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
