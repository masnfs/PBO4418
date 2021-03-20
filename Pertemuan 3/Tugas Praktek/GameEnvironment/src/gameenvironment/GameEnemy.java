/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameenvironment;

/**
 *
 * @author Ncy
 */
public class GameEnemy {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GameEnemy() {
    }
    
    public GameEnemy(double width, double height, int positionX, int positionY) {
        this.width = width;
        this.height = height;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public void settheDimension(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public void setthePosition(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
    
    public double gettheWidth(){
        return width;
    }
    
    public double gettheHeight(){
        return height;
    }
    
    public int gettheX(){
        return positionX;
    }
    
    public int gettheY(){
        return positionY;
    }
    
    public void Run(){
        System.out.println("Enemy is running");
    }
}
