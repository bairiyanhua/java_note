/**
 * 小结：现场编程
 */
public class TestBreak {
	public static void main(String[] args) {
		int sum = 0; // 和
		for (int i = 1; i <= 10; i++) {
			sum = sum + i; // 累加
			if (sum > 20) {
				System.out.print("当前数是:" + i);
				break;
			}
		}
	}
}
