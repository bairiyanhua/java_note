package com1;

import java.util.Random;

/**
 * ��Ϸ��
 * @author Administrator
 *
 */
public class Game {
	
	private Player player; //�������Ϸ

	public Game(Player player){
		this.player = player;
	}
	
	/**
	 * ��ȡ����Ӧ�ȼ�Ҫ������ַ���
	 * @return
	 */
	public String printStr(){
		
//		Level aa = LevelParam.levels[player.getLevelNo()-1];
//		aa.getStrLength();
		
		int length = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		
		//StringBufferר�Ŵ����ַ���ƴ��
		StringBuffer sb = new StringBuffer();
		//Randomר�Ŵ��������
		Random rand = new Random();
		
		for (int i = 0; i < length; i++) {
			int aa = rand.nextInt(length);
			switch (aa) {
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
				sb.append("%");
				break;
			case 6:
				sb.append("$");
				break;
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
	/**
	 * �ж�ϵͳ������û������Ƿ���ͬ
	 * @param out
	 * @param in
	 */
	public void printResult(String out, String in){
		if(out.equals(in)){ //�ж���������Ƿ���ͬ�������ͬ�������߼����������ͬ������ʾ���˳�
			
			long endTime = System.currentTimeMillis(); //��ȡ������ʱ��ʱ��
			
			Level level = LevelParam.levels[player.getLevelNo()-1];
			
			//�ж���û�г�ʱ
			//��ǰʱ�� �� ��ʼʱ�� �õ����õĺ��� ���� 1000 �� �涨��ʱ��Ա�
			if((endTime-player.getStartTime())/1000 > level.getTime()){
				System.out.println("������̫���ˣ��Ѿ���ʱ���˳���");
				System.exit(1);
			}else{
				//���õ�ǰ����
				player.setCurScore(player.getCurScore() + level.getPerScore());
				
				//��������ʱ��
				player.setUseTime((int)(endTime-player.getStartTime())/1000);
				
				System.out.println("������ȷ�����ļ���"+player.getLevelNo()+" ,���Ļ���"+player.getCurScore()+",����ʱ��"+player.getUseTime()+"�롣");
			
				if(player.getLevelNo() == LevelParam.levels.length){
					int score = level.getPerScore() * level.getStrTime();
					if(score == player.getCurScore()){
						System.out.println("���Ѵ��سɹ�����Ϊ�������֣���ϲ��������");
						System.exit(0);
					}
				}
				
			}
			
		}else{
			System.out.println("�������");
			System.exit(1);
		}
		
		
		
	}
	
	
	
	
	
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
	
	
}
