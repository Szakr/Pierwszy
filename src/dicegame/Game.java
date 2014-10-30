package dicegame;

import dicegame.player.Player;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    private List<Player> players = new ArrayList<Player>(); 
    //private Player Player;
    public void addPlayer(Player player){if (player!=null)players.add(player);//this.Player=Player;
            else throw new IllegalArgumentException();
    }
    public void start(){
            Random dice = new Random();     //obiekt losujący (kostka)
        int number,                     //wylosowana liczba
            guess;                      //propozycja (strzał) gracza
        
        do {
            number = dice.nextInt(6) + 1;
            System.out.println("Wylosowane (number): " + number);

            guess = player.guess();     //wywołujemy metodę guess() obiektu gracza (klasy PlayerComp lub PlayerHuman)

            System.out.println("Gracz " + player.getName() + ": " + guess); //wyświetlamy informację zawierającą imię gracza i jego propozycję
            
            if (number == guess) {
                System.out.println("BRAWO!");
            } else {
                System.out.println("PUDŁO!");
            }
            
            System.out.println("---------------------------------------------");
        
        } while (number != guess);
}
}
