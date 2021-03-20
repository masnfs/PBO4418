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
public class GamePlayer {
    private double width;
    private double height;
    private int positionX;
    private int positionY;

    public GamePlayer() {
    }

    public GamePlayer(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public GamePlayer(double width, double height, int positionX, int positionY) {
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
        System.out.println("Player is running");
    }
    
    public void Run(int incrementX){
        positionX = positionX + incrementX;
        System.out.println("Player still running... current X position= " + positionX);
    }
    
}
