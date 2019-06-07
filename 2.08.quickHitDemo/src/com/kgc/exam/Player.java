package com.kgc.exam;

import java.util.Scanner;

/**
 * �����
 * @author Administrator
 *
 */
public class Player {
	
	private int levelNo; //��ҵ�ǰ����ţ�levelNo��
	private int currScore; //��ҵ�ǰ������֣�currScore��
	private long startTime; //��ǰ����ʼʱ�䣨startTime��
	private int useTime; //��ǰ��������ʱ�䣨useTime��
	
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		//���ѭ�����Ƶȼ�
		for (int i = 0; i < LevelParam.levels.length; i++) {
			
			levelNo++; //�ȼ�+1
			currScore = 0;	//������0
			startTime = System.currentTimeMillis();	//���¿�ʼ��ʱ��
			
			//�ڲ�ѭ������ÿ���ȼ��ж�����
			//ѭ��һ�����һ���ַ�������������롢�Ƚ�
			for (int j = 0; j < LevelParam.levels[i].getStrTimes(); j++) {
				//����Game�﷽������ӡ��Ҫ������ַ���
				String out = game.printStr();
				
				String in = input.next();
				
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
	public int getCurrScore() {
		return currScore;
	}
	public void setCurrScore(int currScore) {
		this.currScore = currScore;
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
