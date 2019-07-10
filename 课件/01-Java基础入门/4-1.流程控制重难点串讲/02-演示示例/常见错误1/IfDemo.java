public class IfDemo {
   public static void main(String[] args) {
	  int num = 1;
	  if(num == 1)
		  //以下语句为if代码块，只有一行语句
		  System.out.println("num等于1！");
	  else
		  //当没有花括号时，只有num--;是else分支的代码块
		  num--;
	      //此句不是else分支的代码块，最终都会执行。
		  System.out.println("num自减1后，它的值是"+num);
   }  
}

