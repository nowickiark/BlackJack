import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Deck {

    private LinkedHashMap<String,Integer> deck;
    private ArrayList<String> deckkeys;
    private boolean isOver21;

    public Deck(){
        this.deck = new LinkedHashMap<>();
            deck.put("2",2);
            deck.put("3",3);
            deck.put("4",4);
            deck.put("5",5);
            deck.put("6",6);
            deck.put("7",7);
            deck.put("8",8);
            deck.put("9",9);
            deck.put("T",10);
            deck.put("J",10);
            deck.put("Q",10);
            deck.put("K",10);
            deck.put("A",11);

        this.deckkeys = new ArrayList<>(deck.keySet());
    }

    public void setIsOver21(boolean flag){
        isOver21 = flag;
    }

    public boolean getIsOver21(){
        return isOver21;
    }

    public LinkedHashMap<String,Integer> getFullMap(){
        return deck;
    }

    public ArrayList<String> getDeckNames(){
       return deckkeys;
    }

}
