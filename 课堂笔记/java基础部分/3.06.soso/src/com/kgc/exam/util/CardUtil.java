package com.kgc.exam.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.kgc.exam.entity.Card;
import com.kgc.exam.entity.NetPackage;
import com.kgc.exam.entity.SuperPackage;
import com.kgc.exam.entity.TalkPackage;

/**
 * 所有的业务
 * @author Administrator
 *
 */
public class CardUtil {
	
	//存储所有的卡号实体信息
	Map<String, Card> cardMap = new HashMap<String, Card>();
	
	/**
	 * 预设4个手机卡号
	 */
	public void cardInit(){
		Card card1 = new Card("13965756432","张三三", "123", 58.0, 42.0, new TalkPackage());
		Card card2 = new Card("13956712467","李四四", "123", 68.0, 43.0, new NetPackage());
		Card card3 = new Card("13911568956","王五五", "123", 78.0, 44.0, new SuperPackage());
		Card card4 = new Card("13924221868","赵六六", "123", 88.0, 45.0, new TalkPackage());
		
		cardMap.put("13965756432", card1);
		cardMap.put("13956712467", card2);
		cardMap.put("13911568956", card3);
		cardMap.put("13924221868", card4);
	}
	
	/**
	 * 判断卡号是否存在
	 * @param cardno
	 * @return
	 */
	public boolean isExits(String cardno){
		Set<String> keys = cardMap.keySet();
		return keys.contains(cardno);
	}
	
	
	
	/**
	 * 资费说明
	 */
	public void showMsg(){
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("套餐资费说明.txt");
			br = new BufferedReader(fr);
			String str = br.readLine();
			while(str != null){
				System.out.println(str);
				str = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null){
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fr != null){
						fr.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
