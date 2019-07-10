package cn.com.pb.base;

import java.net.*;
import java.io.*;
public class LoginServer {
	public static void main(String[] args) {
		try {
			//����һ��������Socket��ServerSocket��ָ���˿ڲ���ʼ����
			ServerSocket serverSocket=new ServerSocket(8800);
			//ʹ��accept()�����ȴ��ͻ��˴���ͨ��
			Socket socket=serverSocket.accept();
			//�����������
			InputStream is=socket.getInputStream();
			OutputStream os=socket.getOutputStream();
			//��ȡ�ͻ�����Ϣ��������������ȡ��Ϣ
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String info=null;
			while(!((info=br.readLine())==null)){
				System.out.println("���Ƿ��������ͻ���¼��ϢΪ��"+info);
			}			
			//���ͻ���һ����Ӧ�����������д����Ϣ
			String reply="��ӭ�㣬��¼�ɹ�!";
			os.write(reply.getBytes());
			//�ر���Դ
			br.close();
			os.close();
			is.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
