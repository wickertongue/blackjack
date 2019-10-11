import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    private String name;
    private Game game;

    @Before
    public void before() {
        game = new Game("Blackjack");
    }

    @Test
    public void canGetGameName() {
        assertEquals("Blackjack", game.getName());
    }

    @Test
    public void canGetPlayers() {
        game.addPlayer(player);
        game.addPlayer(dealer);
        assertEquals(0, game.countPlayers());
    }





}

