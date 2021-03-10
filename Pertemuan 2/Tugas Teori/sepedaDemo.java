public class sepedaDemo{
	public static void main(String[] args){
		
		Sepeda sepeda = new Sepeda();
		
		System.out.println(
		"Kecepatan = " + sepeda.kecepatan +
		" Arah Setang = " + sepeda.arah_setang +
		" Penumpang = " + sepeda.penumpang +
		" Harga = " + sepeda.harga +
		" Jumlah Roda = " + sepeda.jumlah_roda
		);
		
		sepeda.gantiKecepatan(100);
		sepeda.setPenumpang(2);
		
		System.out.println(
		"Kecepatan = " + sepeda.kecepatan +
		" Arah Setang = " + sepeda.arah_setang +
		" Penumpang = " + sepeda.penumpang +
		" Harga = " + sepeda.harga +
		" Jumlah Roda = " + sepeda.jumlah_roda
		);
		
	}
}

class Sepeda{
	int kecepatan;
	String arah_setang;
	int penumpang;
	int harga;
	int jumlah_roda;
	
	Sepeda(){
		kecepatan = 10;
		arah_setang = "kanan";
		penumpang = 1;
		harga = 200000;
		jumlah_roda = 2;
	}
	
	public void gantiKecepatan(int newkec){
		kecepatan = newkec;
	}
	
	public void setPenumpang(int newpenumpang){
		penumpang = newpenumpang;
	}
}