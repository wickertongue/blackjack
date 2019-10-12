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

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void setDealer() {
        for (Player player : players) {
            if (player.checkIfDealer()) {
                dealer = player;
            }
        }
    }

    public Player getDealer() {
        Player dealer = null;
        for (Player player : players) {
            if (player.checkIfDealer()) {
                dealer = player;
            }
        }
        return dealer;
    }

}
