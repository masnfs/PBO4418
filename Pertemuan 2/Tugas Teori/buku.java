class buku{
	
	//Class Matematika
	
	String judul_data, pengarang_data, penerbit_data, tahun_data;
	
	buku (String judul, String pengarang, String penerbit, String tahun){
		judul_data = judul;
		pengarang_data = pengarang;
		penerbit_data = penerbit;
		tahun_data = tahun;
	}
	
	void showData(){
		System.out.println("Judul \t\t= " + judul_data);
		System.out.println("Pengarang \t= " + pengarang_data);
		System.out.println("Penerbit \t= " + penerbit_data);
		System.out.println("Tahun \t\t= " + tahun_data);
	}
}