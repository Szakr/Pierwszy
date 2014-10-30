package dicegame.player;

import java.util.Scanner;

public class PlayerHum extends Player {
    
    private Scanner scanner = new Scanner(System.in);
    

    public PlayerHum() {
    }
    
    public PlayerHum(String name) {
        super(name);   
    }
    

    @Override
    public int guess() {
        System.out.print("Podaj liczbę: ");
        return scanner.nextInt();
    }
}