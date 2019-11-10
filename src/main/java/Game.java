import java.util.ArrayList;
import java.util.Scanner;


import static java.lang.Integer.parseInt;

public class Game {
    Scanner scanner = new Scanner(System.in);
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
            Card card1 = deck.dealCard();
            Card card2 = deck.dealCard();
            player.takeCard(card1);
            player.takeCard(card2);
        }
    }

    public void setUp() {
        System.out.println("Blackjack!");
        System.out.println("How many players will be playing today?");

        int playerCount = parseInt(scanner.next());

        for (int i = 0; i < playerCount; i++) {
            String prompt = String.format("Player %s, enter your name: ", (i + 1));
            System.out.println(prompt);
            String playerName = scanner.next();
            Player player = new Player(playerName);
            addPlayer(player);
        }
    }

    public void viewCardsPrompt(Deck deck) {
        for (Player player : getPlayers()) {
            String showCardsPrompt = String.format("%s, please type 'view' to view your cards.",
                    player.getName());
            System.out.println(showCardsPrompt);

            if (scanner.next().equals("view")) {
                for (Card card : player.getHand()) {
                    System.out.println(card.prettyPrintCardWithValue());
                }
            }

            System.out.println("Hand value: " + player.handTotal());

            twistOrStickPrompt(deck, player);
        }
    }

    public void twistOrStickPrompt(Deck deck, Player player) {

        String prompt = String.format("%s, to twist, type 'twist'. To stick, type 'stick'.",
                player.getName());
        System.out.println(prompt);

        String userinput = scanner.next();

        if (userinput.equals("twist")) {
            Card newCard = deck.dealCard();
            player.takeCard(newCard);
            for (Card card : player.getHand()) {
                System.out.println(card.cardName());
            }
            System.out.println("Hand value: " + player.handTotal());
            twistOrStickPrompt(deck, player);
        } else if (userinput.equals("stick")) {
            String response = String.format("%s, you have selected 'stick'. Now on to the next player.",
                    player.getName());
            System.out.println(response);
        } else {
            System.out.println("Your request was not processed correctly");
            twistOrStickPrompt(deck, player);
        }

    }
}
