/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphismklass;

/**
 *
 * @author Ncy
 */

class Car extends MotorVehicle{

    private boolean seatbelt = false;
    
    public Car() {
    }
    
    public void setSeatBelt(int seatbelt){
        this.seatbelt = seatbelt != 0;
    }
    
    public boolean getSeatBelt(){
        return seatbelt;
    }
    
    @Override
    public String toString(){
        return "Car..";
    }
}

class MotorCycle extends MotorVehicle{
    private int numGear = 0;
    
    public MotorCycle(){}
    
    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }
    
    public int getGearFoot(){
        return numGear;
    }
    
    @Override
    public String toString(){
        return "MotorCycle..";
    }
}

class Bicycle extends Vehicle{

    public Bicycle() {
    }
    
    public void Bell(){
        System.out.println("Kring.. Kring..");
    }
    
    @Override
    public String toString(){
        return "Bicycle..";
    }
}

class MotorVehicle extends Vehicle{
    public int sizeofEngine = 1;
    public String licensePlate = "H 1 IDN";
    
    public MotorVehicle(){}

    public MotorVehicle(int sizeofEngine, String licensePlate) {
        this.sizeofEngine = sizeofEngine;
        this.licensePlate = licensePlate;
    }
    
    public int getSizeofEngine(){
        return sizeofEngine;
    }
    
    public String getLicensePlate(){
        return licensePlate;
    }
    
    @Override
    public String toString(){
        return "MotorVehicle..";
    }
}

class Vehicle extends Object{
    public double speed = 0 ;
    public String color = "orange";
    
    public Vehicle(){};
    
    public void goStraight(){
        System.out.println("Maju..");
    }
    public void turnLeft(){
        System.out.println("Belok Kiri");
    }
    public void turnRight(){
        System.out.println("Belok Kanan");
    }
    
    @Override
    public String toString(){
        return "Vehicle..";
    }
    
}

public class UjiKendaraan {
    public static void main(String[] args) {
        /*
        Car cr = new Car();
        MotorCycle mc = new MotorCycle();
        */
        Car targ1 = new Car();
        System.out.println("=============");
        System.out.println(targ1.color);
        System.out.println(targ1.speed);
        System.out.println(targ1.licensePlate);
        System.out.println(targ1.sizeofEngine);
        System.out.println(targ1.getLicensePlate());
        System.out.println(targ1.getSizeofEngine());
        System.out.println(targ1.getSeatBelt());
        targ1.setSeatBelt(3);
        System.out.println(targ1.getSeatBelt());
        targ1.goStraight();
        targ1.turnLeft();
        targ1.turnRight();
        System.out.println("=============");
        System.out.println("===Dynamic===");
        System.out.println(targ1.toString());
        cek(new Car());
        System.out.println("=============");
        
        MotorCycle targ2 = new MotorCycle();
        System.out.println("=============");
        System.out.println(targ2.color);
        System.out.println(targ2.speed);
        System.out.println(targ2.licensePlate);
        System.out.println(targ2.sizeofEngine);
        System.out.println(targ2.getLicensePlate());
        System.out.println(targ2.getSizeofEngine());
        System.out.println(targ2.getGearFoot());
        targ2.setGearFoot(3);
        System.out.println(targ2.getGearFoot());
        targ2.goStraight();
        targ2.turnLeft();
        targ2.turnRight();
        System.out.println("=============");
        System.out.println("===Dynamic===");
        System.out.println(targ2.toString());
        cek(new MotorCycle());
        System.out.println("=============");
        
        KendaraanMelaju(new Car());
        KendaraanMelaju(new MotorCycle());
        
        
        
    }
    
    // Dynamic Binding Too
    public static void cek(Object targ){
        System.out.println(targ.toString());
    }
    
    public static void KendaraanMelaju(Vehicle vehicle){
        vehicle.goStraight();
    }
}
