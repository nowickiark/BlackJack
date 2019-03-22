public class BotBehaviour {

    public static boolean shouldBotTake()
    {
        boolean decision;
        int rand = ((int)Math.random()*1)+1;
        System.out.println(rand);

        if(rand == 1) decision = true;
        else decision = false;

        return decision;


    }

}
