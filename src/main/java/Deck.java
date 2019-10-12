import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();

        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card newCard = new Card(suit, rank);
                cards.add(newCard);
            }
        }
    }

    public int countCards() {
        return this.cards.size();
    }

    public void addCardToCardDeck(Card card) {
        this.cards.add(card);
    }

    public void shuffleCardDeck() {
        Collections.shuffle(cards);
    }

    public Card dealCard(){
        return this.cards.remove(0);
    }
}