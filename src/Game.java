import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private BlackJackJudge judge;
    private Deck deck;

    public Game(Player player1, Player player2, BlackJackJudge judge, Deck deck) throws InterruptedException {

        this.player1 = player1;
        this.player2 = player2;
        this.judge = judge;
        this.deck = deck;
        this.deck.setIsOver21(false);

        pleyTheGame();

    }

    public void pleyTheGame() throws InterruptedException {

        while (!deck.getIsOver21()) {
            System.out.println("Do you want to take next card? ");
            System.out.print("Y/N : ");
            String answer = scan.nextLine();

            if (answer.toLowerCase().equals("y")) {
                player1.takecard();
                deck.setIsOver21(judge.isOver(player1));

                if (!deck.getIsOver21()) {
                    Thread.sleep(1000);

                    player2.takecard();
                    deck.setIsOver21(judge.isOver(player2));
                }
            } else {
                deck.setIsOver21(true);
                if (BotBehaviour.shouldBotTake()) player2.takecard();
                BlackJackJudge.getWiner(player1, player2);
            }

        }

    }


}
