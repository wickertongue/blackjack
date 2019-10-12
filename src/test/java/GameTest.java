import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;
    private Deck deck;

    @Before
    public void before() {
        game = new Game("Blackjack");
        player1 = new Player("Joe");
        player2 = new Player("Sandy");
        deck = new Deck("Decklan");

        game.addPlayer(player1);
        game.addPlayer(player2);
        player1.setDealer();
        deck.createCardDeck();
        player1.drawCard(deck);
        player1.drawCard(deck);
        player2.drawCard(deck);
        player2.drawCard(deck);
    }

    @Test
    public void canGetGameName() {
        assertEquals("Blackjack", game.getName());
    }

    @Test
    public void canAddPlayersToPlayerArray() {
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void canGetDealer() {
        assertEquals(player1, game.getDealer());
        assertNotEquals(player2, game.getDealer());
    }

}

