public class TestTV{
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

class TV{
	int channelNow = 1;
	int volumeLevelNow = 1;
	boolean onNow = false;
	
	public TV(){}
	
	public void nyalakan(){
		onNow = true;
	}
	
	public void matikan(){
		onNow = false;
	}
	
	public void gotoChannel(int toChannel){
		if (toChannel > 0 && toChannel < 121){
			channelNow = toChannel;
		} else {
			//pass
		}
	}
	
	public void setVol(int newvol){
		if (newvol > 0 && newvol < 8){
			volumeLevelNow = newvol;
		} else {
			//pass
		}
	}
	
	public void channelAtas(){
		channelNow--;
		if (channelNow < 1){
			channelNow = 120;
		}
	}
	
	public void channelBawah(){
		channelNow++;
		if (channelNow > 120){
			channelNow = 1;
		}
	}
	
	public void volUP(){
		volumeLevelNow++;
		if (channelNow > 7){
			channelNow = 7;
		}
	}
	
	public void volDown(){
		volumeLevelNow--;
		if (channelNow < 0){
			channelNow = 0;
		}
	}
}