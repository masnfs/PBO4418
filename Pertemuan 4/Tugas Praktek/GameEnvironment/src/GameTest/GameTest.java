/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameTest;

/**
 *
 * @author Ncy
 */
public class GameTest {
    public static void main(String[] args) {
        // TODO code application logic here
        /*
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
        */
        
        GamePlayer hero = new GamePlayer();
        hero.settheDimension(12, 12);
        hero.setthePosition(10, 20);
        System.out.println("Posisi Player: " + hero.gettheX() + ", " + hero.gettheY());
        hero.Run(12);
        System.out.println("Posisi Player: " + hero.gettheX() + ", " + hero.gettheY());
        GamePlayer hero2 = new GamePlayer();
        hero2.settheDimension(12, 32);
        hero2.setthePosition(10, 220);
        
        GameEnemy monster = new GameEnemy();
        monster.settheDimension(12, 12);
        monster.setthePosition(10, 220);
        
        GameEnvironment scene = new GameEnvironment();
        scene.addPlayer(hero);
        scene.addPlayer(hero);
        scene.addPlayer(hero2);
        scene.getAllPlayers();
        scene.removePlayer(hero);
        scene.getAllPlayers();
        scene.addEnemy(monster);
        scene.Interaction();
        
    }
}
