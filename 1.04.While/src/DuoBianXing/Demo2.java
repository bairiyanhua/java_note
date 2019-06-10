package DuoBianXing;

public class Demo2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			// j:空白
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			// j:每一行中星星的个数，列数
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			// 每一行星星输出完毕后要换行
			System.out.println();
		}
	}

}
