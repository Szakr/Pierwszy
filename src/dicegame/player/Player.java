package dicegame.player;

/**
 * Abstrakcyjna klasa bazowa dla klas graczy.
 * 
 * Definiuje abstrakcyjną metodę guess().
 */

public abstract class Player {


    public Player() {
        name = "Anonim";
    }
    
    public Player(String name) {
        this.name = name;
    }    

    private String name;
    
    public void setName(String name) {
        //sprawdzamy, czy nazwa nie jest null ani nie jest pusta ("")
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            //jeśli nazwa nie jest poprawna, rzucamy wyjątek IllegalArgumentException z odpowiednim komunikatem
            throw new IllegalArgumentException("Imię nie może być puste!");
        }
    }
    
    public String getName() {
        return name;
    }
        

    public abstract int guess();
    
}