package com1;

import java.util.Scanner;


public class Player {
	private int levelNum;	//��ǰ�ȼ�
	private int jiFen;	//��ǰ����
	private long startTime;	//��ʼʱ��
	private int usedTime;	//����ʱ��

	 // �������Ϸ
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		
		//���ѭ������ȼ���ÿѭ��һ�Σ��ȼ�+1
		for (int i = 0; i < LevelParam.levels.length; i++) {
			levelNum++;
			jiFen = 0;
			
			//���÷���ʱ�����������к�����
			startTime = System.currentTimeMillis();
			
			//�ڲ�ѭ����������Ŀ��
			for (int j = 0; j < LevelParam.levels[levelNum-1].getStrTime(); j++) {
				
				//����ַ���
				String out = game.printStr();
				
				//�����ַ���
				String in = input.next();
				
				//�ж���������ֵ�Ƿ���ȡ�
				game.printResult(out, in);
				
			}	
		}	
	}

	public int getLevelNo() {
		return levelNum;
	}

	public void setLevelNo(int levelNo) {
		this.levelNum = levelNo;
	}

	public int getCurScore() {
		return jiFen;
	}

	public void setCurScore(int curScore) {
		this.jiFen = curScore;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getUseTime() {
		return usedTime;
	}

	public void setUseTime(int useTime) {
		this.usedTime = useTime;
	}

}
