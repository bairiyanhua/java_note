package com.kgc.exam;

/**
 * ��Ϸ������
 * �趨��Ϸ������Щ����
 * @author Administrator
 *
 */
public class Level {

	private int levelNo; // �ȼ�
	private int strLength; // ÿ������ַ����ĳ���
	private int strTime; // ÿ���ȼ�Ҫ������ַ����Ĵ���
	private int time; // �涨�ĵȼ�����ʱ��
	private int perScore; // ÿ���һ��ĵ÷�

	/**
	 * �вι��췽��
	 * @param levelNo
	 * @param strLength
	 * @param strTime
	 * @param time
	 * @param perScore
	 */
	public Level(int levelNo, int strLength, int strTime, int time, int perScore) {
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTime = strTime;
		this.time = time;
		this.perScore = perScore;
	}

	
	
	public Level() {
	}



	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}

	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}

	public int getStrTime() {
		return strTime;
	}

	public void setStrTime(int strTime) {
		this.strTime = strTime;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPerScore() {
		return perScore;
	}

	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}

}
