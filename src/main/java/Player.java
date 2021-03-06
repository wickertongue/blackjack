import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private boolean dealer;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
        this.dealer = false;
    }

    public String getName() {
        return this.name;
    }

    public int countHand() {
        return this.hand.size();
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void takeCard(Card card) {
        this.hand.add(card);
    }

    public boolean checkIfDealer() {
        return this.dealer;
    }

    public void assignDealer() {
        this.dealer = true;
    }

    public int handTotal() {
        int handTotal = 0;
        for (Card card : this.hand) {
            handTotal += card.getValue();
        }
        return handTotal;
    }

    public void twist(Card card) {
        takeCard(card);
    }


}


