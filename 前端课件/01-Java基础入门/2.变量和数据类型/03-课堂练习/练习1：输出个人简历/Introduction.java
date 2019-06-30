import java.util.Scanner;

/**
 * 自我介绍
 * @author administrator
 *
 */
public class Introduction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "小明"; //姓名
		int age = 25; //年龄
		int year = 5;  //工作年限
		int projectNum = 3;  //完成的项目
		String technical = "Java";
		String hobby = "篮球";
		System.out.print("这个同学姓名是："+name);
		System.out.println("年龄是："+age);
		System.out.println("工作了"+year+"年了");
		System.out.println("做过"+projectNum+"个项目");
		System.out.println("技术方向是"+technical);
		System.out.println("兴趣爱好是："+hobby);
	}
}
