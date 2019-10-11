import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player1;
    private Card card;
    private Deck deck;

    @Before
    public void before() {
        player1 = new Player("Judy");
        card = new Card(SuitType.HEARTS, RankType.JACK);
        deck = new Deck("Decklan");

        deck.createCardDeck();
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Judy", player1.getName());
    }

    @Test
    public void playerHandStartsAtZero() {
        assertEquals(0, player1.countHand());
    }

    @Test
    public void playerHandIncreasesWhenCardDrawn() {
        player1.drawCard(deck);
        player1.drawCard(deck);
        assertEquals(2, player1.countHand());
    }
}
