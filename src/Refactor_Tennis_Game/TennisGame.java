package Refactor_Tennis_Game;

public class TennisGame {

    public static final int BASE_SCORE = 0;
    public static final int FIRST_SCORE = 1;
    public static final int SECOND_SCORE = 2;
    public static final int THIRD_SCORE = 3;
    public static final int ZEZO_SCORE = 0;
    public static final int ONE_SCORE = 1;
    public static final int TWO_SCORE = 2;
    public static final int THREE_SCORE = 3;

    public static String getScore(String player1Name, String player2Name, int first_player_score, int second_player_score) {
        String player_score = "";
        int tempScore=0;
        if (first_player_score==second_player_score)
        {
            switch (first_player_score)
            {
                case BASE_SCORE:
                    player_score = "Love-All";
                    break;
                case FIRST_SCORE:
                    player_score = "Fifteen-All";
                    break;
                case SECOND_SCORE:
                    player_score = "Thirty-All";
                    break;
                case THIRD_SCORE:
                    player_score = "Forty-All";
                    break;
                default:
                    player_score = "Deuce";
                    break;
            }
        }
        else if (first_player_score>=4 || second_player_score>=4)
        {
            int minusResult = first_player_score-second_player_score;
            if (minusResult==1) player_score ="Advantage player1";
            else if (minusResult ==-1) player_score ="Advantage player2";
            else if (minusResult>=2) player_score = "Win for player1";
            else player_score ="Win for player2";
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = first_player_score;
                else { player_score+="-"; tempScore = second_player_score;}
                switch(tempScore)
                {
                    case ZEZO_SCORE:
                        player_score+="Love";
                        break;
                    case ONE_SCORE:
                        player_score+="Fifteen";
                        break;
                    case TWO_SCORE:
                        player_score+="Thirty";
                        break;
                    case THREE_SCORE:
                        player_score+="Forty";
                        break;
                }
            }
        }
        return player_score;
    }
}
