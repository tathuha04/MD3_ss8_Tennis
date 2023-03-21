public class TennisGame {
    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
//        if (m_score1==m_score2)
//        {
//            switch (m_score1)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//            }
//        }
//        else if (m_score1>=4 || m_score2>=4)
//        {
//            int minusResult = m_score1-m_score2;
//            if (minusResult==1) score ="Advantage player1";
//            else if (minusResult ==-1) score ="Advantage player2";
//            else if (minusResult>=2) score = "Win for player1";
//            else score ="Win for player2";
//        }
//        else
//        {
//            for (int i=1; i<3; i++)
//            {
//                if (i==1) tempScore = m_score1;
//                else { score+="-"; tempScore = m_score2;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
//        }

        if (m_score1==m_score2) {
            if(m_score1 <4){
                score = getScoreString(m_score1)+ "_All";
            }else {
                score= "Deuce";
            }
        }else if(m_score1>3||m_score2>3){
            int minusScore = m_score1-m_score2;
            if(Math.abs(minusScore)==1){
                score = "Advantage for "+((minusScore>0)?player1Name:player2Name);
            }else {
                score = ((minusScore>0)?player1Name:player2Name) + " win";
            }
        }else {
            score = getScoreString(m_score1) + " - " + getScoreString(m_score2);
        }
        return score;
    }

    public static String getScoreString(int score){
        String scoreToString="";
        switch (score){
            case 0:
                scoreToString= "Love";
                break;
            case 1:
                scoreToString= "Fifteen";
                break;
            case 2:
                scoreToString = "Thirty";
                break;
            case 3:
                scoreToString ="Forty";
                break;
            default:
                break;
        }
        return scoreToString;
    }
}
