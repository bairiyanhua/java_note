package com.kgc.exam;

/**
 * ��Ϸ������
 * �趨�������Ϸ����
 * @author Administrator
 *
 */
public class LevelParam {

	public static Level[] levels = new Level[6];
	
	static{
//		Level l1 = new Level(1, 2, 10, 30, 1);
//		l1.setLevelNo(1);
//		l1.setStrLength(2);
//		l1.setStrTime(10);
//		l1.setTime(30);
//		l1.setPerScore(1);
//		levels[0] = l1;
		
		levels[0] = new Level(1, 2, 10, 30, 1);
		levels[1] = new Level(2, 3, 9, 26, 2);
		levels[2] = new Level(3, 4, 8, 22, 5);
		levels[3] = new Level(4, 5, 7, 18, 8);
		levels[4] = new Level(5, 6, 6, 15, 10);
		levels[5] = new Level(6, 7, 5, 12, 15);
		
	}
	
	
}
