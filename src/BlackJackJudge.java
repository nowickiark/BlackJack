public class BlackJackJudge {

    private int[] scoreboard;
    private Player player1;
    private Player player2;


    public BlackJackJudge(Player player1, Player player2){
        this.scoreboard = new int[1];
        this.player1 = player1;
        this.player2 = player2;

    }


    public boolean isOver(Player currentPlayer){

        boolean isTrue = false;

        if(currentPlayer.getHandCounter() > 21) {
            isTrue = true;
            System.out.printf("Player %s over exceed 21 points!",currentPlayer.getName());
        }else if(currentPlayer.getHandCounter() == 21)
        {
            System.out.printf("Player %s hit Jackpot! ",currentPlayer.getName());
            isTrue = true;
        }

        return isTrue;
    }

    public static void getWiner(Player player1, Player player2)
    {
        if((21 - player1.getHandCounter()) < (21 - player2.getHandCounter()))
        {
            System.out.printf("Player %s wins! with %d points to %d ",player1.getName(), player1.getHandCounter(), player2.getHandCounter());
        }
        else {
            System.out.printf("Player %s wins! with %d points to %d ",player2.getName(), player2.getHandCounter(), player1.getHandCounter());
        }
    }



}
