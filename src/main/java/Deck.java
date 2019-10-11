import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private String name;
    private ArrayList<Card> cardDeck;

    public Deck(String name) {
        this.name = name;
        this.cardDeck = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

    public int countCards() {
        return this.cardDeck.size();
    }

    public void addCardToCardDeck(Card card) {
        this.cardDeck.add(card);
    }

    public void createCardDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                Card newCard = new Card(suit, rank);
                cardDeck.add(newCard);
            }
        }
    }

    public void shuffleCardDeck() {
        Collections.shuffle(cardDeck);
    }

    public Card dealCard(){
        Card cardToDeal = this.cardDeck.get(0);
        this.cardDeck.remove(0);
        return cardToDeal;
    }
}