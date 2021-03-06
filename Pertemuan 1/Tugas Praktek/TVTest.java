public class TVTest{
	public static void main(String args[]){
		TV tv1 = new TV();
		tv1.nyalakan();
		tv1.gotoChannel(50);
		tv1.setVol(5);
		
		TV tv2 = new TV();
		tv2.nyalakan();
		tv2.gotoChannel(90);
		tv2.setVol(7);
		
		System.out.println("[TV's 1 Status]" + 
		" Nyala: " + tv1.onNow +
		"| Channel: " + tv1.channelNow + 
		"| Volume: " + tv1.volumeLevelNow);
		
		System.out.println("[TV's 2 Status]" + 
		" Nyala: " + tv2.onNow + 
		"| Channel: " + tv2.channelNow + 
		"| Volume: " + tv2.volumeLevelNow);
	}
}