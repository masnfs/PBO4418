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
public abstract class benda {
    private String color;
    
    public void setColor(String color){this.color = color;}
    
    public abstract String getTipe();
    public abstract int getHarga();
}

class Mobil extends benda{
    private String tipe;
    private int harga;
    
    public Mobil(){};
    public Mobil(String tipe, int harga){
        this.tipe = tipe;
        this.harga = harga;
    };
    public Mobil(String tipe, int harga, String color){
        this.tipe = tipe;
        this.harga = harga;
        setColor(color);
    };
    
    public String getTipe(){
        return tipe;
    }
    
    public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
}