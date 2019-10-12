import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    private Player player1;
    private Card card;
    private Deck deck;

    @Before
    public void before() {
        player1 = new Player("Judy");
        card = new Card(SuitType.HEARTS, RankType.JACK);
        deck = new Deck();

        player1.takeCard(card);
        player1.takeCard(card);
    }

    @Test
    public void canGetPlayerName() {
        assertEquals("Judy", player1.getName());
    }

    @Test
    public void playerHandIncreasesWhenCardDrawn() {
        assertEquals(2, player1.countHand());
    }

    @Test
    public void canGetPlayerHandTotal() {
        assertNotEquals(0, player1.handTotal());
    }


    @Test
    public void canSetPlayerAsDealer() {
        player1.assignDealer();
        assertEquals(true, player1.checkIfDealer());
    }

    @Test
    public void playerShouldDefaultToNotDealer(){
        assertEquals(false, player1.checkIfDealer());
    }

    @Test
    public void playerCanTwist() {
        player1.twist(card);
        assertEquals(3, player1.countHand());
    }


}
