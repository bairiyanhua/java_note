package com.kgc.exam;

/**
 * 游戏规则类
 * 设定游戏都有哪些规则
 * @author Administrator
 *
 */
public class Level {

	private int levelNo; // 等级
	private int strLength; // 每次输出字符串的长度
	private int strTime; // 每个等级要输出的字符串的次数
	private int time; // 规定的等级过关时间
	private int perScore; // 每答对一题的得分

	/**
	 * 有参构造方法
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
