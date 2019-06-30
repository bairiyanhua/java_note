/**
 * 显示10以内的整数
 * 
 *
 */
public class DowhileDemo {
   public static void main(String[] args) {
	  int i = 30;  
	  do{
		  //循环初始条件不满足时，循环仍可执行一次
		  System.out.println(i);
		  i++;
	  }while(i<10);
   }
}
