/**
 * 循环输出10以内的整数
 *
 */
public class WhileDemo {
   public static void main(String[] args) {
	   //循环条件初始化
	  int i = 1;
	  //括号后紧跟分号，表明循环体是空语句
	  while(i<10);{
		  System.out.println(i);
		  i++;	//错误，死循环，无法跳出循环
	  }
   }
}
