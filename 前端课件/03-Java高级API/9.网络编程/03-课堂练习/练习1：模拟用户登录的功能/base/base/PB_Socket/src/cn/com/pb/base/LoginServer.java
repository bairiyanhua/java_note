package cn.com.pb.base;

import java.net.*;
import java.io.*;
public class LoginServer {
	public static void main(String[] args) {
		try {
			//建立一个服务器Socket（ServerSocket）指定端口并开始监听
			ServerSocket serverSocket=new ServerSocket(8800);
			//使用accept()方法等待客户端触发通信
			Socket socket=serverSocket.accept();
			//打开输入输出流
			InputStream is=socket.getInputStream();
			OutputStream os=socket.getOutputStream();
			//获取客户端信息，即从输入流读取信息
			BufferedReader br=new BufferedReader(new InputStreamReader(is));
			String info=null;
			while(!((info=br.readLine())==null)){
				System.out.println("我是服务器，客户登录信息为："+info);
			}			
			//给客户端一个响应，即向输出流写入信息
			String reply="欢迎你，登录成功!";
			os.write(reply.getBytes());
			//关闭资源
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
