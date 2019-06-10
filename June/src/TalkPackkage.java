
public class TalkPackkage {
	
	private int talkTime;
	private int smsCount;
	
	
	public void showInfo(){
		System.out.println("话痨套餐：通话时长为"+talkTime+":短信条数为"+smsCount+":资费是"+getPrice());
	}
	public int getTalkTime() {
		return talkTime;
	}
	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}
	public int getSmsCount() {
		return smsCount;
	}
	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}
	
	}
	


