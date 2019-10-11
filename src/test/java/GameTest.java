import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private Game game;
    private Player player;
    private Dealer dealer;

    @Before
    public void before() {
        game = new Game("Blackjack");
        player = new Player("Joe");
        dealer = new Dealer("Samuel");

        game.addDealer(dealer);
    }

    @Test
    public void canGetGameName() {
        assertEquals("Blackjack", game.getName());
    }

    @Test
    public void playersArrayStartsEmpty() {
        game.countPlayers();
        assertEquals(0, game.countPlayers());
    }

    @Test
    public void canAddPlayersToPlayerArray() {
        game.addPlayer(player);
        assertEquals(1, game.countPlayers());
    }




}

