import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Player> players;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return this.name;
    }
}
