
import java.util.Scanner;

public class LuckCard{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入4位会员卡号：");
		int cardId = input.nextInt();
		System.out.print("会员卡号是：");
		System.out.println(cardId);

	}
}
