import java.util.Scanner;

public class Visitor {
	String name;	//姓名
	int age;		//年龄
	
	public void show(){
		Scanner input = new Scanner(System.in);
		while(!"n".equals(name)){
			if(age>=18 && age<=60){		//判断年龄
				System.out.println(name + "的年龄为：" + age +
					"，门票价格为：20元\n" );
			}else{
				System.out.println(name + "的年龄为：" + age + "，门票免费\n");
			}
			System.out.print("请输入姓名：");
			name = input.next();			//给name属性赋值
			if(!"n".equals(name)){
				System.out.print("请输入年龄：");
				age = input.nextInt();			//给age属性赋值
			}
		}
		System.out.print("退出程序");
	}
}
