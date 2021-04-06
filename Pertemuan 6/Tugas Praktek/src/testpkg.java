/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import vehicleinherit.Bicycle;
import vehicleinherit.MotorVehicle;
import vehicleinherit.Vehicle;

/**
 *
 * @author Ncy
 */
public class testpkg {
    public static void main(String[] args) {
        Bicycle cycle = new Bicycle();
        MotorVehicle moto = new MotorVehicle();
        
        System.out.println(cycle.color);
        System.out.println(cycle.speed);
        cycle.Bell();
        System.out.println("=============");
        System.out.println(moto.color);
        System.out.println(moto.speed);
        System.out.println(moto.licensePlate);
        System.out.println(moto.sizeofEngine);
        System.out.println(moto.getLicensePlate());
        System.out.println(moto.getSizeofEngine());
    }
}
