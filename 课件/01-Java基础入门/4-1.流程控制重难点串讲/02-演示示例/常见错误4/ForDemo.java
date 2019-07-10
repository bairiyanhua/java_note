/**
 * For循环
 *
 */
public class ForDemo {
	public static void main(String[] args) {
		int i=1;  //for中没有初始化语句时，需在for前初始化
		for(;i<10;){
			System.out.println(i);
			i++;  //for中没有循环迭代，需在此处写循环迭代语句
		}
	}
}
