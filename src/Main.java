import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws InterruptedException {
    Scanner scan = new Scanner(System.in);

    Deck deck = new Deck();
    Player Arek = new Player("Arek",deck);
    Player Bot = new Player("Bot", deck);
    BlackJackJudge judge = new BlackJackJudge(Arek,Bot);


    while (!deck.getIsOver21())
    {
        System.out.println("Do you want to take next card? ");
        System.out.print("Y/N : ");
        String answer = scan.nextLine();

        if (answer.toLowerCase().equals("y"))
        {
            Arek.takecard();
            deck.setIsOver21(judge.isOver(Arek));

            if(!deck.getIsOver21()) {
                Thread.sleep(1000);

                Bot.takecard();
                deck.setIsOver21(judge.isOver(Bot));
            }
        }
        else {
            deck.setIsOver21(true);
            if(BotBehaviour.shouldBotTake()) Bot.takecard();
            BlackJackJudge.getWiner(Arek,Bot);
        }

    }





    }
}
