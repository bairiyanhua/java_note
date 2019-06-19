import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarDutil {
	Map<String, Card> cardMap = new HashMap<String, Card>();
	public boolean isExist(String cardNo) {
		Set<String> Keys = cardMap.keySet();
		return Keys.contains(cardNo);
	}

	public void chongzhi(String cardno, double money) {
		Card card = cardMap.get(cardno);
		card.setMoney(card.getMoney() + money);
		System.out.println("充值成功，您的当前余额为：" + card);
	}

	public void show() {
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader("套餐资费说明.txt");
			br = new BufferedReader(fr);
			String str = br.readLine();
			while (str != null) {
				System.out.println(str);
				str = br.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}
