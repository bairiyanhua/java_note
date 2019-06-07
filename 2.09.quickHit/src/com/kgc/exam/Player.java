package com.kgc.exam;

import java.util.Scanner;

/**
 * �����
 * 
 * @author Administrator
 * 
 */
public class Player {

	private int levelNo;	//��ҵ�ǰ�ĵȼ�
	private int curScore;	//��ҵ�ǰ�Ļ���
	private long startTime;	//��ҿ�ʼ��ʱ��
	private int useTime;	//���õ�ʱ��

	/**
	 * �������Ϸ
	 */
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		
		//���ѭ������ȼ���ÿѭ��һ�Σ��ȼ�+1
		for (int i = 0; i < LevelParam.levels.length; i++) {
			levelNo++;
			curScore = 0;
			
			//��1970��1��1�� 00:00:00��ʼ�������÷���ʱ�����������к�����
			startTime = System.currentTimeMillis();
			
			//�ڲ�ѭ��������ÿ���ȼ�Ҫ�������Ŀ��
			for (int j = 0; j < LevelParam.levels[levelNo-1].getStrTime(); j++) {
				
				//��ȡ����ַ���
				String out = game.printStr();
				
				//�����ַ���
				String in = input.next();
				
				//���÷����ж�����ֵ�Ƿ����
				game.printResult(out, in);
				
				
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getCurScore() {
		return curScore;
	}

	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getUseTime() {
		return useTime;
	}

	public void setUseTime(int useTime) {
		this.useTime = useTime;
	}

}
