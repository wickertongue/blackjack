import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int countHand() {
        return this.hand.size();
    }

    public void drawCard(Deck deck) {
        this.hand.add(deck.dealCard());
    }
}


