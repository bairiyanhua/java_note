public class ZhazhiJi {
    public String zhazhi ( String fruit ) {
          String juice = fruit + "֭";
          return juice; 
     }
    
    public static void main(String[] args){
    	/*����zhazhi����*/
    	ZhazhiJi myZhazhiji = new ZhazhiJi();
    	String myFruit = "ƻ��";
    	String myJuice = myZhazhiji.zhazhi(myFruit);
    	System.out.println(myJuice);
    }
}
