
public class Card {
	private String cardNo;
	private String userName;
	private String password;
	private double money;
	private double consumerMoney;
	private PackService packservice;
	
	public PackService getPackservice() {
		return packservice;
	}
	public void setPackservice(PackService packservice) {
		this.packservice = packservice;
	}
	public String getCardNum() {
		return cardNo;
	}
	public void setCardNum(String cardNum) {
		this.cardNo = cardNum;
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
	private PackService packService;
	
	

}
