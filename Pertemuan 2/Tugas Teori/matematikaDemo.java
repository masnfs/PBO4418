public class matematikaDemo{
	// Matematika Demo
	// tempat eksekusi
	public static void main(String[] args){
		
		matematika math1 = new matematika(10,20);
		matematika math2 = new matematika(100,4);
		
		System.out.println("[Math1] 10 & 20");
		System.out.println("Penjumlahan " + math1.pertambahan());
		System.out.println("Pengurangan " + math1.pengurangan());
		System.out.println("Perkalian " + math1.perkalian());
		System.out.println("Pembagian " + math1.pembagian());
		
		System.out.println("[Math1 ganti angka ke 20 dan 40]");
		math1.gantiAngka(20, 40);
		System.out.println("Penjumlahan " + math1.pertambahan());
		System.out.println("Pengurangan " + math1.pengurangan());
		System.out.println("Perkalian " + math1.perkalian());
		System.out.println("Pembagian " + math1.pembagian());
		
		System.out.println("[Math2] 100 & 4");
		System.out.println("Penjumlahan " + math2.pertambahan());
		System.out.println("Pengurangan " + math2.pengurangan());
		System.out.println("Perkalian " + math2.perkalian());
		System.out.println("Pembagian " + math2.pembagian());
		
		System.out.println("[Math2 ganti angka ke 64 dan 4]");
		math1.gantiAngka(64, 4);
		System.out.println("Penjumlahan " + math2.pertambahan());
		System.out.println("Pengurangan " + math2.pengurangan());
		System.out.println("Perkalian " + math2.perkalian());
		System.out.println("Pembagian " + math2.pembagian());
		
		//Done

	}
}