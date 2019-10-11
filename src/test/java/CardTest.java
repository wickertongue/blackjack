import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    private Card card;

    @Before
    public void before() {
        card = new Card(SuitType.HEARTS, RankType.JACK);
    }

    @Test
    public void canGetCard() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.JACK, card.getRank());
    }
}
