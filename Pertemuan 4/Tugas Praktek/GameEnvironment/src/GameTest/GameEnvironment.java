/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTest;
import java.util.*;

/**
 *
 * @author Ncy
 */
public class GameEnvironment {

    /**
     * @param args the command line arguments
     */
    private double width;
    private double height;
    private ArrayList<GamePlayer> arrPlayer = new ArrayList<GamePlayer>();
    private ArrayList<GameEnemy> arrEnemy = new ArrayList<GameEnemy>();

    public GameEnvironment() {
    }

    public GameEnvironment(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    // Player
    public void addPlayer(GamePlayer GamePlayer){
        arrPlayer.add(GamePlayer);
    }
    
    public void removePlayer(GamePlayer GamePlayer){
        arrPlayer.remove(GamePlayer);
    }
    
    public void getAllPlayers(){
        System.out.println("Player List: " + arrPlayer);
    }
    
    // Enemy
    public void addEnemy(GameEnemy GameEnemy){
        arrEnemy.add(GameEnemy);
    }
    
    public void removeEnemy(GameEnemy GameEnemy){
        arrEnemy.remove(GameEnemy);
    }
    
    public void getAllEnemy(){
        System.out.println("Enemy List: " + arrEnemy);
    }
    
    public void Interaction(){
        if (arrPlayer == null || arrEnemy == null){
            System.out.println("Player or Enemy not Set");
        }
        for (int i = 0; i < arrPlayer.size(); i++){
            for (int j = 0; j < arrEnemy.size(); j++){
                if (arrPlayer.get(i).gettheY() != arrEnemy.get(j).gettheY()){
                    System.out.println("Player: " + arrPlayer.get(i) + " and Enemy: " + arrEnemy.get(j) + " not in the same Y position");
                }
                    
                if (EuclideanDistance(arrPlayer.get(i).gettheX(), arrPlayer.get(i).gettheY(), arrEnemy.get(j).gettheX(), arrEnemy.get(j).gettheY()) < 2){
                    System.out.println("Player: " + arrPlayer.get(i) + " Attacked");
                    System.out.println("Enemy: " + arrEnemy.get(j) + " loses");
                    removeEnemy(arrEnemy.get(j));
                } else {
                    System.out.println("==> Player "+arrPlayer.get(i));
                    arrPlayer.get(i).Run((int)Math.ceil(Math.random()*10));
                    System.out.println("current x position =  " + arrPlayer.get(i).gettheX() +" <==");
                }   
            }
        }
    }
    
    
    public double EuclideanDistance(int x1, int y1, int x2, int y2){
        /*
        int ycoord = y2 - y1;
        int xcoord = x2 - x1;
        double result =  Math.sqrt(((ycoord)*(ycoord)) + ((xcoord)*(xcoord)));
        return result;
        */
        
        return (int) Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
}
