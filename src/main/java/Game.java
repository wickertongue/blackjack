import java.util.ArrayList;

public class Game {
    private String name;
    private ArrayList<Player> players;
    private Player dealer;
    private Deck deck;

    public Game(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.dealer = null;
        this.deck = deck;
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

    public void addDealer(Player player) {
        player.assignDealer();
        this.players.add(player);
    }

    public void setDealer() {
        for (Player player : players) {
            if (player.checkIfDealer()) {
                this.dealer = player;
            }
        }
    }

    public Player getDealer() {
        return this.dealer;
    }

    public Player getWinner() {
        int highest = 0;
        Player winner = null;
        for (Player player : players) {
            if (player.handTotal() > highest && player.handTotal() < 22) {
                highest = player.handTotal();
                winner = player;
            }
        }
        return winner;
    }

    public void start(Deck deck) {
        for (Player player : this.players) {
            Card card = deck.dealCard();
            player.takeCard(card);
            player.takeCard(card);
        }
    }

}

