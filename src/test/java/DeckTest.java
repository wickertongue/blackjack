import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    private Deck deck;
    private Card card;
    private ArrayList<Card> cardDeck;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.JACK);
        cardDeck = new ArrayList<Card>();
        deck = new Deck();
    }

    @Test
    public void cardsIncreasesAsCardIsAdded() {
        deck.addCardToCardDeck(card);
        assertEquals(53, deck.countCards());
    }

    @Test
    public void canCreateFullDeckInCards() {
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canGetCardFromDeck() {
        deck.shuffleCards();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }

    @Test
    public void shuffleCards() {
        deck.shuffleCards();
        deck.dealCard();
        deck.dealCard();
        deck.dealCard();
        assertEquals(49, deck.countCards());
    }

}
