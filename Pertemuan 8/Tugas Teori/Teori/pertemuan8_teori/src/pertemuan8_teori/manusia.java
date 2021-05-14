/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan8_teori;

import java.util.ArrayList;

/**
 *
 * @author Ncy
 */

public interface manusia {
    public void walk();
}

interface role_karyawan {
    String tipe = "Karyawan";
    
    public void greet();
}

interface role_pembeli {
    public void greet();
}

//Class Karyawan
class karyawan implements manusia, role_karyawan{
    public String nama;
    public int umur;
    public int untung;
    

    public karyawan() {}
    //public karyawan(String nama) {this.nama = nama;}
    public karyawan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    public void cekLogBeli(pembeli Pembeli){
        for (Mobil x:Pembeli.belanjaan){
            System.out.println("Belanjaan dari " + Pembeli.nama + " Yaitu " + x.getTipe());
        }
    }
    
    public void setHargaMobil(Mobil mobil, int harga){
        mobil.setHarga(harga);
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public String getRole(){
        return tipe;
    }
    
    public void walk(){
        System.out.println(tipe + " Sedang berjalan..");
    }
    
    public void greet(){
        System.out.println("Halo Customer..");
    }
}


// Class ini untuk 2 buah jenis pembeli
class pembeli implements manusia, role_pembeli{
    String nama;
    int umur;
    String tipe;
    ArrayList<Mobil> belanjaan = new ArrayList<>();
    
    public pembeli() {}
    
    /*
    public pembeli(String nama) {this.nama = nama;}
    public pembeli(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    */
    
    public pembeli(String nama, int umur, String tipe) {
        this.nama = nama;
        this.umur = umur;
        this.tipe = tipe;
    }
    
    public void buyCar(Mobil mobil, karyawan Karyawan){
        
        if (belanjaan.isEmpty()){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else if (mobil.getTipe() == belanjaan.get(0).getTipe() && tipe == "Pembeli Individu"){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else if (tipe == "Pembeli Borongan"){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else {
            System.out.println("Hanya dapat membeli satu tipe mobil!");
        }
    }
    
    public ArrayList cekBelanjaan(){
        return belanjaan;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setRole(String role){
        tipe = role;
    }
    
    public String getRole(){
        return tipe;
    }
    
    public void walk(){
        System.out.println(tipe + " Sedang berjalan..");
    }
    
    public void greet(){
        System.out.println("Halo Karyawan..");
    }
}


//Class ini opsional hanya untuk memenuhi Polymorphism saja
class pembeli2 extends pembeli{
    String nama;
    int umur;
    String tipe;
    ArrayList<Mobil> belanjaan = new ArrayList<>();
    
    public pembeli2() {}
    
    /*
    public pembeli(String nama) {this.nama = nama;}
    public pembeli(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    */
    
    public pembeli2(String nama, int umur, String tipe) {
        this.nama = nama;
        this.umur = umur;
        this.tipe = tipe;
    }
    
    public void buyCar(Mobil mobil, karyawan Karyawan){
        
        if (belanjaan.isEmpty()){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else if (mobil.getTipe() == belanjaan.get(0).getTipe() && tipe == "Pembeli Individu"){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else if (tipe == "Pembeli Borongan"){
            belanjaan.add(mobil);
            Karyawan.untung += mobil.getHarga() * 0.1;
        } else {
            System.out.println("Hanya dapat membeli satu tipe mobil!");
        }
    }
    
    public ArrayList cekBelanjaan(){
        return belanjaan;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public int getUmur(){
        return umur;
    }
    
    public void setRole(String role){
        tipe = role;
    }
    
    public String getRole(){
        return tipe;
    }
    
    // Polymorphism
    public void walk(){
        System.out.println(tipe + " Sedang malas berjalan..");
    }
    
    // Polymorphism
    public void greet(){
        System.out.println("WOY Karyawan..");
    }
}

