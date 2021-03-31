/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleinherit;

/**
 *
 * @author Ncy
 */
public class Vehicle {
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
    
}

class Bicycle extends Vehicle{

    public Bicycle() {
    }
    
    public void Bell(){
        System.out.println("Kring.. Kring..");
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
}