package com1;


//设定游戏的各种规则
 
public class Level {

	private int levelNum; // 玩家等级
	private int strLength; // 每次输出字符串的长度
	private int time; // 等级过关时间
	private int jiFen2; // 每次答对一道题的得分
	private int scTime; // 每个等级输出字符串的次数
	

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
