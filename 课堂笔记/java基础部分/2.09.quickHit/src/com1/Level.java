package com1;


//�趨��Ϸ�ĸ��ֹ���
 
public class Level {

	private int levelNum; // ��ҵȼ�
	private int strLength; // ÿ������ַ����ĳ���
	private int time; // �ȼ�����ʱ��
	private int jiFen2; // ÿ�δ��һ����ĵ÷�
	private int scTime; // ÿ���ȼ�����ַ����Ĵ���
	

	public Level(int levelNo, int strLength, int strTime, int time, int perScore) {
		this.levelNum = levelNo;
		this.strLength = strLength;
		this.scTime = strTime;
		this.time = time;
		this.jiFen2 = perScore;
	}

	
	
	public Level() {
	}



	public int getLevelNo() {
		return levelNum;
	}

	public void setLevelNo(int levelNo) {
		this.levelNum = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPerScore() {
		return jiFen2;
	}

	public void setPerScore(int perScore) {
		this.jiFen2 = perScore;
	}

	public int getStrTime() {
		return scTime;
	}

	public void setStrTime(int strTime) {
		this.scTime = strTime;
	}

}
