package staticDemo;

public class TestVoter {
	public static void main(String[] args) {
		Voter zhang=new Voter("����");
		Voter li=new Voter("����");
		Voter wang=new Voter("����");
		
		Voter.printResult();
		
		zhang.voteFor();
		li.voteFor();
		wang.voteFor();
		
		Voter.printResult();
		
		for(int i=1;i<=97;i++){
			Voter v=new Voter("v"+i);
			v.voteFor();
		}
		
		Voter v101=new Voter("v101");
		v101.voteFor();
		
		Voter.printResult();
	}
}
