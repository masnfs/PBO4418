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
public class GameEnvironment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GamePlayer player1 = new GamePlayer();
        player1.settheDimension(1, 2);
        player1.setthePosition(3, 4);
        System.out.println(player1.gettheWidth());
        System.out.println(player1.gettheHeight());
        System.out.println(player1.gettheX());
        System.out.println(player1.gettheY());
        player1.Run();
        player1.Run(30);
        
        GameEnemy enemy1 = new GameEnemy();
        enemy1.settheDimension(10, 20);
        enemy1.setthePosition(30, 40);
        System.out.println(enemy1.gettheWidth());
        System.out.println(enemy1.gettheHeight());
        System.out.println(enemy1.gettheX());
        System.out.println(enemy1.gettheY());
        enemy1.Run();
        
        
        
    }
    
}
