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

    Game game = new Game(Arek,Bot,judge,deck);




    }
}
