package TennisGame;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        final int Love = 0;
        final int Fifteen = 1;
        final int Thirty = 2;
        final int Forty = 3;
        if (scorePlayer1==scorePlayer2)
        {
            score = new StringBuilder(switch (scorePlayer1) {
                case Love -> "Love-All";
                case Fifteen -> "Fifteen-All";
                case Thirty -> "Thirty-All";
                case Forty -> "Forty-All";
                default -> "Deuce";
            });
        }
        else if (scorePlayer1>=4 || scorePlayer2>=4)
        {
            int minusResult = scorePlayer1-scorePlayer2;
            if (minusResult==1) score = new StringBuilder("Advantage player1");
            else if (minusResult ==-1) score = new StringBuilder("Advantage player2");
            else if (minusResult>=2) score = new StringBuilder("Win for player1");
            else score = new StringBuilder("Win for player2");
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = scorePlayer1;
                else { score.append("-"); tempScore = scorePlayer2;}
                switch (tempScore) {
                    case Love -> score.append("Love");
                    case Fifteen -> score.append("Fifteen");
                    case Thirty -> score.append("Thirty");
                    case Forty -> score.append("Forty");
                }
            }
        }
        return score.toString();
    }
}