import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        Game game = new Game();
        Player dealer = new Player("Dean the Dealer");

        game.addPlayer(dealer);
        dealer.assignDealer();
        game.setDealer();

        System.out.println("Blackjack!");
        System.out.println("How many players will be playing today?");

        int players = parseInt(scanner.next());

        for (int i = 0; i < players; i++) {
            String prompt = String.format("Player %s, enter your name: ", (i + 1));
            System.out.println(prompt);
            String playerName = scanner.next();
            Player player = new Player(playerName);
            game.addPlayer(player);
        }

        game.start(deck);

        for (Player player : game.getPlayers()) {
            String showCardsPrompt = String.format("Player %s, please type 'view' to view your cards.",
                    player.getName());
            System.out.println(showCardsPrompt);

            if (scanner.next().equals("view")) {
                for (Card card : player.getHand()) {
                    System.out.println(card.cardName());
                }
            }
        }

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
