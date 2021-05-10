/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8_teori;

/**
 *
 * @author Ncy
 */
public class CekHarpindoKita {
    public static void main(String[] args){
        //Sistem mengSET data/biodata Manusia
        Mobil mobil_sedan = new Mobil("Sedan", 1000, "Black");
        Mobil mobil_minibus = new Mobil("Minibus", 5000, "Yellow");
        Mobil mobil_bus = new Mobil("Bus", 10000, "White");

        karyawan karyawan1 = new karyawan("Sutejo", 33);
        karyawan karyawan2 = new karyawan("Trisno", 35);

        pembeli pembeli_individu = new pembeli("Sukarto", 25, "Pembeli Individu");
        pembeli pembeli_borongan = new pembeli("Kartoyo", 30, "Pembeli Borongan");
        pembeli2 pembeli_cekpoly = new pembeli2("Dimas", 23, "Cek Doang");
        
        //Cek pembeli_individu membeli mobil
        // beli satu ajalah banyak2 mobil bikin sempit aja
        //Cek untung karyawan1
        pembeli_individu.buyCar(mobil_sedan, karyawan1);
        System.out.println(karyawan1.untung);
        
        //Cek pembeli_borongan membeli mobil
        //Cek untung karyawan2
        pembeli_borongan.buyCar(mobil_bus, karyawan2);
        pembeli_borongan.buyCar(mobil_bus, karyawan2);
        pembeli_borongan.buyCar(mobil_bus, karyawan2);
        System.out.println(karyawan2.untung);
        
        
        //Karyawan1 cek Log pembeli_borongan
        karyawan1.cekLogBeli(pembeli_borongan);
        
        //Karyawan2 cek Log pembeli_individu
        karyawan2.cekLogBeli(pembeli_individu);
        
        
        //Cek Polymorphism
        System.out.println("Pembeli2 pembeli_cekpoly");
        pembeli_cekpoly.walk();
        pembeli_cekpoly.greet();
        
        System.out.println("Pembeli pembeli_individu");
        pembeli_individu.walk();
        pembeli_individu.greet();
    
    
    }
}
