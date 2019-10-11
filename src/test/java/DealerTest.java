import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {
    private Dealer dealer;
    private Deck deck;

    @Before
    public void before() {
        dealer = new Dealer("Jonny");
        deck = new Deck("Decklan");

        deck.createCardDeck();
    }

    @Test
    public void canGetDealerName() {
        assertEquals("Jonny", dealer.getName());
    }

    @Test
    public void dealersHandStartsEmpty() {
        assertEquals(0, dealer.countHand());
    }

    @Test
    public void dealersHandIncreasesAsHeTakesCards() {
        dealer.drawCard(deck);
        dealer.drawCard(deck);
        assertEquals(2, dealer.countHand());
    }
}
