//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Collection;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TennisGameTest {
    private int player1Score;
    private int player2Score;
    private String expectedScore;

    public TennisGameTest(int player1Score, int player2Score, String expectedScore) {
        this.player1Score = player1Score;
        this.player2Score = player2Score;
        this.expectedScore = expectedScore;
    }

    @Parameters
    public static Collection<Object[]> getAllScores() {
        return Arrays.asList(new Object[]{0, 0, "Love-All"}, new Object[]{1, 1, "Fifteen-All"}, new Object[]{2, 2, "Thirty-All"}, new Object[]{3, 3, "Forty-All"}, new Object[]{4, 4, "Deuce"}, new Object[]{1, 0, "Fifteen-Love"}, new Object[]{0, 1, "Love-Fifteen"}, new Object[]{2, 0, "Thirty-Love"}, new Object[]{0, 2, "Love-Thirty"}, new Object[]{3, 0, "Forty-Love"}, new Object[]{0, 3, "Love-Forty"}, new Object[]{4, 0, "Win for player1"}, new Object[]{0, 4, "Win for player2"}, new Object[]{2, 1, "Thirty-Fifteen"}, new Object[]{1, 2, "Fifteen-Thirty"}, new Object[]{3, 1, "Forty-Fifteen"}, new Object[]{1, 3, "Fifteen-Forty"}, new Object[]{4, 1, "Win for player1"}, new Object[]{1, 4, "Win for player2"}, new Object[]{3, 2, "Forty-Thirty"}, new Object[]{2, 3, "Thirty-Forty"}, new Object[]{4, 2, "Win for player1"}, new Object[]{2, 4, "Win for player2"}, new Object[]{4, 3, "Advantage player1"}, new Object[]{3, 4, "Advantage player2"}, new Object[]{5, 4, "Advantage player1"}, new Object[]{4, 5, "Advantage player2"}, new Object[]{15, 14, "Advantage player1"}, new Object[]{14, 15, "Advantage player2"}, new Object[]{6, 4, "Win for player1"}, new Object[]{4, 6, "Win for player2"}, new Object[]{16, 14, "Win for player1"}, new Object[]{14, 16, "Win for player2"});
    }

    @Test
    public void checkAllScores() {
        int highestScore = Math.max(this.player1Score, this.player2Score);
        int m_score1 = 0;
        int m_score2 = 0;

        for(int i = 0; i < highestScore; ++i) {
            if (i < this.player1Score) {
                ++m_score1;
            }

            if (i < this.player2Score) {
                ++m_score2;
            }
        }

        Assertions.assertEquals(this.expectedScore, TennisGame.getScore("John", "Bill", m_score1, m_score2));
    }
}
