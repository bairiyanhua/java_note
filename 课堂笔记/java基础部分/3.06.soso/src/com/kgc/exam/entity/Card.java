package com.kgc.exam.entity;

/**
 * 卡
 * 
 * @author Administrator
 * 
 */
public class Card {

	private String cardNo; // 卡号
	private String userName; // 用户名
	private String password; // 密码
	private double money; // 余额
	private double consumerMoney; // 当月消费金额
	private PackService packService; // 所属套餐
	
	public Card() {
	}

	public Card(String cardNo, String userName, String password, double money,
			double consumerMoney, PackService packService) {
		this.cardNo = cardNo;
		this.userName = userName;
		this.password = password;
		this.money = money;
		this.consumerMoney = consumerMoney;
		this.packService = packService;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getConsumerMoney() {
		return consumerMoney;
	}

	public void setConsumerMoney(double consumerMoney) {
		this.consumerMoney = consumerMoney;
	}

	public PackService getPackService() {
		return packService;
	}

	public void setPackService(PackService packService) {
		this.packService = packService;
	}

}
