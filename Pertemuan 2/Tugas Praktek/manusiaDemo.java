public class manusiaDemo{
	public static void main(String[] args){
		
		manusia man1 = new manusia("Eriek");
		System.out.println(man1.namaSaya());
		
		TV tvku = new TV();
		man1.beliTV(tvku);
		System.out.println(man1.cekTV());
		man1.jualSemuaTV();
		System.out.println(man1.cekTV());
	}
}

class manusia{
	String nama;
	boolean punyaTV;
	
	public manusia(){
		nama = "noname";
	}
	
	public manusia(String newName){
		nama = newName;
	}
	
	public String namaSaya(){
		return nama;
	}
	
	public void beliTV(TV tiviku){
		punyaTV = true;
	}
	
	public void jualSemuaTV(){
		punyaTV = false;
	}
	
	public boolean cekTV(){
		return punyaTV;
	}
}