import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;
    private Player player1;
    private Player player2;
    private Dealer dealer;

    @Before
    public void before() {
        game = new Game("Blackjack");
        player1 = new Player("Joe");
        player2 = new Player("Sandy");
        dealer = new Dealer("Samuel");

        game.addDealer(dealer);
        game.addPlayer(player1);
        game.addPlayer(player2);
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
        assertEquals(dealer, game.getDealer());
    }


}

