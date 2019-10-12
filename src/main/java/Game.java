import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Player dealer;
    private Deck deck;

    public Game() {
        this.players = new ArrayList<Player>();
        this.dealer = null;
        this.deck = deck;
    }

    public int countPlayers() {
        return this.players.size();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
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
        deck.shuffleCards();
        for (Player player : this.players) {
            player.takeCard(deck.dealCard());
            player.takeCard(deck.dealCard());
        }
    }

}

