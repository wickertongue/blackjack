import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Player> players;
    private Dealer dealer;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.dealer = null;
    }

    public String getName() {
        return this.name;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void addDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

}
