package DuoBianXing;

public class Demo6 {
	public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		// j:空白
		for (int j = 1; j <= 5 - i; j++) {
			System.out.print(" ");
		}
		// j:每一行中星星的个数，列数
		for (int j = 1; j <= 2*i-1; j++) {
			System.out.print(j-1);
		}
		// 每一行星星输出完毕后要换行
		System.out.println();
	}
//再补一个四行的倒三角
	for (int i= 1; i <= 4; i++) {
	
		for (int j = 1; j <=i ; j++) {
		System.out.print(" ");
	}
	// j:每一行中星星的个数，列数
		for (int j = 1; j <=2*(5-i)-1; j++) {
		System.out.print(j-1);
	}	
	System.out.println();
}
}

}
