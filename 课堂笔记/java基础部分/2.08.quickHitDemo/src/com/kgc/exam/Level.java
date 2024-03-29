package com.kgc.exam;

/**
 * 游戏组成类
 * @author Administrator
 *
 */
public class Level {
	
	private int levelNo; //各级别号（levelNo）
	private int strLength; //各级别一次输出字符串的长度（strLength）
	private int strTimes; //各级别输出字符串的次数（strTimes）
	private int timeLimit; //各级别闯关的时间限制（timeLimit）
	private int perScore; //各级别正确输入一次的得分（perScore）
	
	public Level(int levelNo, int strLength, int strTimes, int timeLimit,
			int perScore) {
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
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
	public int getStrTimes() {
		return strTimes;
	}
	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}

	
	
}
