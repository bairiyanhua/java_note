
import java.util.Scanner;

public class BreakDemo {
	/**
	 * 循环录入学生成绩，输入负数则退出
	 */
	  public static void main(String[] args) {
	       int score;    					//每门课的成绩
	       int sum = 0;  					//成绩之和
	       int avg;      					//平均分
	       boolean isNegative = false;    	//是否为负数
	       Scanner input = new Scanner(System.in);
	       System.out.print("输入学生姓名: ");
	       String name = input.next(); 	    //输入姓名
	       for(int i = 0; i < 5; i++){ 	    //循环5次录入5门课成绩  
	            System.out.print("请输入第" + (i+1) + "门课的成绩： ");
	            score = input.nextInt();
	            if(score < 0){			   //输入负数
	    		        isNegative = true;
	    		        break;
	    	       }
	            sum = sum + score;    	   //累加求和
	       }
	       if(isNegative){
	            System.out.println("抱歉，分数录入错误，请重新进行录入！");
	       }else{
	            avg = sum / 5;             //计算平均分
	            System.out.println(name + "的平均分是：" + avg);
	       }
	  }
	}

