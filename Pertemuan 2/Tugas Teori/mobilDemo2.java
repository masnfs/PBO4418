class Mobil {
	String warna;
	int tahunProduksi;
	int gigi;
	boolean hidup = false;
	
	public void hidupkanMobil(){
		hidup = true;
	}
	
	public void matikanMobil(){
		hidup = false;
	}
	
	public void ubahGigi(int newGigi){
		gigi = newGigi;
	}
}
public class mobilDemo2{
	public static void main(String[] args){
		// Membuat object
	  Mobil mobilku = new Mobil();
		
		//memanggil atribut  dan memberi nilai
	  mobilku.warna = "Hitam";
	  mobilku.tahunProduksi = 2006;
	  mobilku.hidupkanMobil();
	  mobilku.ubahGigi(3);
	  
	  System.out.println("Hidup: " + mobilku.hidup);
	  System.out.println("Gigi: " + mobilku.gigi);
	  System.out.println("Warna: " + mobilku.warna);
	  System.out.println("Tahun: " + mobilku.tahunProduksi);
	  
	  mobilku.matikanMobil();
	  System.out.println("Hidup: " + mobilku.hidup);
  }}
