package cn.jbit.quickhit;

import java.util.Random;
/**
 * ��Ϸ�ࡣ
 * @author ��������
 */
public class Game {
	private Player player;// ���
		
	/**
	 * ���췽�������������Ϣ��
	 * @param player ���
	 */
	public Game(Player player) {
		this.player = player;
	}
	/**
	 * ���ָ������涨���ȵ��ַ�����
	 * @return ������ַ��������ں��û�����Ƚ�
	 */
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo() - 1].getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		// 1��ͨ��ѭ������Ҫ������ַ���
		for (int i = 0; i < strLength; i++) {
			// 1.1�����������
			int rand = random.nextInt(strLength);
			// 1.2�����������ƴ���ַ���
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
		// 2������ַ���
		System.out.println(buffer);
		// 3�������ַ������ں����������Ƚ�
		return buffer.toString();
	}

}
