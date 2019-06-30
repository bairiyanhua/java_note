package cn.jbit.quickhit;

import java.util.Random;
/**
 * 游戏类。
 * @author 北大青鸟
 */
public class Game {
	private Player player;// 玩家
		
	/**
	 * 构造方法，传入玩家信息。
	 * @param player 玩家
	 */
	public Game(Player player) {
		this.player = player;
	}
	/**
	 * 输出指定级别规定长度的字符串。
	 * @return 输出的字符串，用于和用户输入比较
	 */
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo() - 1].getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		// 1、通过循环生成要输出的字符串
		for (int i = 0; i < strLength; i++) {
			// 1.1、产生随机数
			int rand = random.nextInt(strLength);
			// 1.2、根据随机数拼接字符串
			switch (rand) {
			case 0:
				buffer.append(">");
				break;
			case 1:
				buffer.append("<");
				break;
			case 2:
				buffer.append("*");
				break;
			case 3:
				buffer.append("&");
				break;
			case 4:
				buffer.append("%");
				break;
			case 5:
				buffer.append("#");
				break;
			}
		}
		// 2、输出字符串
		System.out.println(buffer);
		// 3、返回字符串用于和玩家输入相比较
		return buffer.toString();
	}

}
