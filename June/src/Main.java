import java.util.Scanner;

public class Main {

	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		CarDutil util=new CarDutil();
		
		
		do{
			System.out.println();
			System.out.println("*************欢迎使用嗖嗖移动业务大厅");
			System.out.println("1.用户登录 2.用户注册 3.使用嗖嗖 4.花费充值 5.资费说明 6.退出系统");
			System.out.println("请选择：");
			int choose=input.nextInt();
			if(choose==1){
				System.out.println("---用户登录---");
				
			}else if(choose==2){
				System.out.println("---用户注册---");
			}else if(choose==3){
				System.out.println("---使用嗖嗖---");
			}else if(choose==4){
				System.out.println("---话费充值---");
				System.out.println("请输入卡号：");
			}else if(choose==5){
				System.out.println("---资费说明---");
			}else if(choose==6){
				System.out.println("---退出登录---");
				System.out.println("谢谢使用!");
			}
		System.out.println("请选择");
		
		
		
		
		}
		
	}

}
