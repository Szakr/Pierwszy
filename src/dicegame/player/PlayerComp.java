package dicegame.player;

import java.util.Random;


public class PlayerComp extends Player {


    public PlayerComp() {
    }
    
    public PlayerComp(String name) {
        super(name);    //wywołujemy konstruktor klasy nadrzędnej (Player) z jednym parametrem
    }

    @Override
    public int guess() {
        int guess = guesser.nextInt(6) + 1;
        return guess;
    }
    
    private Random guesser = new Random();
}