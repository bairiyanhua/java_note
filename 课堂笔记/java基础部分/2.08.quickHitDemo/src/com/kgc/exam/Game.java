package com.kgc.exam;

import java.util.Random;

/**
 * ��Ϸ��
 * @author Administrator
 *
 */
public class Game {
	
	private Player player;
	
	public Game(Player player) {
		this.player = player;
	}

	/**
	 * ���ָ������涨�����ַ���
	 * ������ַ������ں����������ַ������Ա�
	 * @return
	 */
	public String printStr(){
		//��ȡҪ������ַ�������
		int length = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		
		//ʹ��StringBufferƴ���ַ���
		StringBuffer sb = new StringBuffer();
		//ͨ�������ȡ��ÿ��Ҫƴ�ӵ��ַ�
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int key = random.nextInt(length);
			switch (key) {
			case 0:
				sb.append("<");
				break;
			case 1:
				sb.append(">");
				break;
			case 2:
				sb.append("*");
				break;
			case 3:
				sb.append("&");
				break;
			case 4:
				sb.append("#");
				break;
			case 5:
				sb.append("$");
				break;
			case 6:
				sb.append("@");
				break;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public void printResult(String out, String in){
		if(out.equals(in)){ //�ж���������Ƿ�һ�£������ͬ�������������ͬ������ʾ���˳�
			long time = System.currentTimeMillis();
			//������ͬ���ж���û�г�ʱ
			//��ǰʱ��-��ʼʱ�� �õ����õĺ���/1000�͹涨��ʱ��Ա�
			if((time-player.getStartTime())/1000 < LevelParam.levels[player.getLevelNo()-1].getTimeLimit()){
				//���û���
				player.setCurrScore(player.getCurrScore() + LevelParam.levels[player.getLevelNo()-1].getPerScore());
				//����ʱ��
				player.setUseTime((int)(time-player.getStartTime())/1000);
				System.out.println("������ȷ�����ļ���"+player.getLevelNo()+" ,���Ļ���"+player.getCurrScore()+",����ʱ��"+player.getUseTime()+"�롣");
				
				if(player.getLevelNo() == LevelParam.levels.length){ //�ж��Ƿ��������˳�
					int score = LevelParam.levels[player.getLevelNo()-1].getStrTimes() * LevelParam.levels[player.getLevelNo()-1].getPerScore();
					if(score == player.getCurrScore()){
						System.out.println("���Ѵ��سɹ�����Ϊ�������֣���ϲ��������");
						System.exit(0);
					}
				}
				
			}else{ //�����ʱ���˳�
				System.out.println("������̫���ˣ��Ѿ���ʱ���˳���");
				System.exit(1);
			}
		}else{ //�����������ͬ
			System.out.println("�������");
			System.exit(1);
		}
		
		
	}
	

}
