package com.kgc.exam;

/**
 * ถþฮฌสýื้
 * @author Administrator
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		//[344, 23, 12, 8, 4, 2, 1]
		//[[1,2,3], [3,4,5], [5,6,7]]
		//[[[1,2,3], [3,4,5], [5,6,7]], [[1,2,3], [3,4,5], [5,6,7]], [[1,2,3], [3,4,5], [5,6,7]]]
		int[][] aa = new int[3][5];
		aa[0][0] = 25;
		aa[0][1] = 26;
		aa[0][2] = 27;
		aa[0][3] = 28;
		aa[0][4] = 29;
		
		aa[1][0] = 25;
		aa[1][1] = 26;
		aa[1][2] = 27;
		aa[1][3] = 28;
		aa[1][4] = 29;
		
		aa[2][0] = 25;
		aa[2][1] = 26;
		aa[2][2] = 27;
		aa[2][3] = 28;
		aa[2][4] = 29;
		
		for (int i = 0; i < aa.length; i++) {
			for (int j = 0; j < aa[i].length; j++) {
				aa[i][j] = 0;
			}
		}
		
		
		
		
		
		
	}

}
