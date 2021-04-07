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

public class MotorVehicle extends Vehicle{
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