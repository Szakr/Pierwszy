package dicegame;

import dicegame.player.Player;
import dicegame.player.PlayerComp;
import dicegame.player.PlayerHum;
import java.util.Random;


public class DiceGame {


    public static void main(String[] args) {

        
        Player player = new PlayerComp("Bob");  

        
        Game gra =new Game();
        try{
        gra.addPlayer(player);
        gra.start();
        }catch(IllegalArgumentException e){}
    }
    
}