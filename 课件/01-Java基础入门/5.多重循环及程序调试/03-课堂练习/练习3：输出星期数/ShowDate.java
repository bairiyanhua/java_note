import java.util.*;
public class ShowDate {
	public static void main(String[] args){
		//定义变量
		int inputNum = -1;  //记录用户输入
		Scanner input = new Scanner(System.in);
		String date = "";  //记录星期几
		//循环询问用户输入的数字
		do{
			//询问用户输入的数字：
			System.out.print("请输入数字（1~7），输入0结束：");
			inputNum = input.nextInt();
			//分支：根据用户输入的内容，显示相应星期几
			switch(inputNum){
			case 1:
				//System.out.println("星期一");
				date = "星期一";
				break;
			case 2:
				//System.out.println("星期二");
				date = "星期二";
				break;
			case 3:
				System.out.println("星期三");
				date = "星期三";
				break;
			case 4:
				//System.out.println("星期四");
				date = "星期四";
				break;
			case 5:
				//System.out.println("星期五");
				date = "星期五";
				break;
			case 6:
				//System.out.println("星期六");
				date = "星期六";
				break;
			case 7:
				//System.out.println("星期日");
				date = "星期日";
				break;
			case 0:
				break;
			default:
				System.out.println("您的输入有误！");	
				break;
			}
			if(inputNum>=1 && inputNum<=7){
			System.out.println(date);
			}
			
		}while(inputNum != 0);
		System.out.println("程序结束！");
	}
}
