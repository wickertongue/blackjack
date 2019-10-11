import java.util.ArrayList;

public class Dealer {
    private String name;
    private ArrayList<Card> hand;

    public Dealer(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName() {
        return this.name;
    }

}
