package com1;

import java.util.Random;

/**
 * 游戏类
 * @author Administrator
 *
 */
public class Game {
	
	private Player player; //玩家玩游戏

	public Game(Player player){
		this.player = player;
	}
	
	/**
	 * 获取到对应等级要输出的字符串
	 * @return
	 */
	public String printStr(){
		
//		Level aa = LevelParam.levels[player.getLevelNo()-1];
//		aa.getStrLength();
		
		int length = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		
		//StringBuffer专门处理字符串拼接
		StringBuffer sb = new StringBuffer();
		//Random专门处理随机数
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
	 * 判断系统输出和用户输入是否相同
	 * @param out
	 * @param in
	 */
	public void printResult(String out, String in){
		if(out.equals(in)){ //判断输入输出是否相同，如果相同，继续逻辑，如果不相同，给提示，退出
			
			long endTime = System.currentTimeMillis(); //获取到输入时的时间
			
			Level level = LevelParam.levels[player.getLevelNo()-1];
			
			//判断有没有超时
			//当前时间 减 开始时间 得到已用的毫秒 除以 1000 和 规定的时间对比
			if((endTime-player.getStartTime())/1000 > level.getTime()){
				System.out.println("您输入太慢了，已经超时，退出！");
				System.exit(1);
			}else{
				//设置当前积分
				player.setCurScore(player.getCurScore() + level.getPerScore());
				
				//设置已用时间
				player.setUseTime((int)(endTime-player.getStartTime())/1000);
				
				System.out.println("输入正确，您的级别"+player.getLevelNo()+" ,您的积分"+player.getCurScore()+",已用时间"+player.getUseTime()+"秒。");
			
				if(player.getLevelNo() == LevelParam.levels.length){
					int score = level.getPerScore() * level.getStrTime();
					if(score == player.getCurScore()){
						System.out.println("您已闯关成功，成为绝世高手，恭喜您！！！");
						System.exit(0);
					}
				}
				
			}
			
		}else{
			System.out.println("输入错误");
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
