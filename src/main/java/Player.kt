import java.util.ArrayList

class Player(val name: String) {
    private val hand: ArrayList<Card>

    init {
        this.hand = ArrayList()
    }

    fun countHand(): Int {
        return this.hand.size
    }

    fun drawCard(deck: Deck) {
        this.hand.add(deck.dealCard())
    }
}


