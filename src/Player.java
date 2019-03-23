import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Player {

    private String name;
    private ArrayList<String> hand = new ArrayList<>();
    private Deck deck;
    private int handCounter;
    private boolean isOver21;
    private int noOfwins;

    public Player(String name,Deck deck )
    {
        this.name = name;
        this.deck = deck;
        this.isOver21 = false;
    }


    public void takecard(){
        int random = (int)(Math.random()*13);
        String tempcard = deck.getDeckNames().get(random);

        hand.add(tempcard);
        handCounter = handCounter + deck.getFullMap().get(tempcard);

        System.out.println(name + " get " + tempcard );

        /*        deck.setIsOver21(BlackJackJudge.isOver(this));*/

    }

    public int getNoOfwins() {
        return noOfwins;
    }

    public void setNoOfwins(int noOfwins) {
        this.noOfwins = noOfwins;
    }

    public String getName(){
        return name;
    }

    public int getHandCounter() {
        return handCounter;
    }

    public ArrayList<String> getHand(){
        return hand;
    }

}
