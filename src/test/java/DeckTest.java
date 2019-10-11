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
        deck = new Deck("Decklan");
    }

    @Test
    public void canGetDeckName() {
        assertEquals("Decklan", deck.getName());
    }

    @Test
    public void cardsStartsEmpty() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void cardsIncreasesAsCardIsAdded() {
        deck.addCardToCardDeck(card);
        assertEquals(1, deck.countCards());
    }

    @Test
    public void canCreateFullDeckInCards() {
        deck.createCardDeck();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canGetCardFromDeck() {
        deck.createCardDeck();
        deck.shuffleCardDeck();
        deck.dealCard();
        assertEquals(51, deck.countCards());
    }

    @Test
    public void dealingMoreThanOneCardFromDeckLowersDeckCount() {
        deck.createCardDeck();
        deck.shuffleCardDeck();
        deck.dealCard();
        deck.dealCard();
        deck.dealCard();
        assertEquals(49, deck.countCards());
    }

}
