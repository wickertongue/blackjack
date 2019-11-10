import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Game game = new Game();
        Player dealer = new Player("Dean the Dealer");

        dealer.assignDealer();
        game.setDealer();

        game.setUp();
        game.start(deck);
        game.viewCardsPrompt(deck);


        System.out.println("Blackjack!");


//        for (Player player : game.getPlayers()) {
//            String output = String.format("%s has:", player.getName());
//            System.out.println(output);
//
//            for (Card card : player.getHand()) {
//                System.out.println(card.cardName());
//            }
//            System.out.println(String.format("Hand total: %s", player.handTotal()));
//        }
    }
}
