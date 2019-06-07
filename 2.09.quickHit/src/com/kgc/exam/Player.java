package com.kgc.exam;

import java.util.Scanner;

/**
 * 玩家类
 * 
 * @author Administrator
 * 
 */
public class Player {

	private int levelNo;	//玩家当前的等级
	private int curScore;	//玩家当前的积分
	private long startTime;	//玩家开始的时间
	private int useTime;	//已用的时间

	/**
	 * 玩家玩游戏
	 */
	public void play(){
		Scanner input = new Scanner(System.in);
		Game game = new Game(this);
		
		//外层循环代表等级，每循环一次，等级+1
		for (int i = 0; i < LevelParam.levels.length; i++) {
			levelNo++;
			curScore = 0;
			
			//从1970年1月1号 00:00:00开始，到调用方法时所经过的所有毫秒数
			startTime = System.currentTimeMillis();
			
			//内层循环，代表每个等级要输入的题目数
			for (int j = 0; j < LevelParam.levels[levelNo-1].getStrTime(); j++) {
				
				//获取输出字符串
				String out = game.printStr();
				
				//输入字符串
				String in = input.next();
				
				//调用方法判断两个值是否相等
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
