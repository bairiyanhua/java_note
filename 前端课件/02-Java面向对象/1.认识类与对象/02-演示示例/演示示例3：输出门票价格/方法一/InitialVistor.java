
import java.util.Scanner;
public class InitialVistor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Visitor v = new Visitor();		//创建对象
		System.out.print("请输入姓名：");
		v.name = input.next();			//给name属性赋值
		System.out.print("请输入年龄：");
		v.age = input.nextInt();		//给age属性赋值
		v.show();                       //调用显示信息方法
	}
}
