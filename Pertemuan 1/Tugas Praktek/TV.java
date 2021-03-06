public class TV{
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