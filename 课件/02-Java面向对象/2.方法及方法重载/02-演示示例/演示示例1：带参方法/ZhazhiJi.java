public class ZhazhiJi {
    public String zhazhi ( String fruit ) {
          String juice = fruit + "汁";
          return juice; 
     }
    
    public static void main(String[] args){
    	/*调用zhazhi方法*/
    	ZhazhiJi myZhazhiji = new ZhazhiJi();
    	String myFruit = "苹果";
    	String myJuice = myZhazhiji.zhazhi(myFruit);
    	System.out.println(myJuice);
    }
}
