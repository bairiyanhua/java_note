import java.io.*;

public class FileInputStreamTest {
	public static void main(String[] args){
		FileInputStream fis=null;
		//����������
		try {
			fis=new FileInputStream("d:\\myDoc\\hello.txt");
			int data;
			System.out.println("�ɶ�ȡ���ֽ�����"+fis.available());
			System.out.print("�ļ�����Ϊ��");
			//ѭ�������� read()�����Ǵ���������ȡ1��8λ���ֽڣ�����ת��Ϊ0-255֮����������ء������ص�����ת��Ϊ�ַ�
			while((data=fis.read())!=-1){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				//�ر�������
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
