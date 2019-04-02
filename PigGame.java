import java.util.Scanner;

public class PigGame {
    public static int computerScore = 0, playerScore = 0;
    public int tempComputerScore = 0, tempPlayerScore = 0;

    public PigGame() {

    }

    public int rollPlayer() {
        int roll = (int)(Math.random() * 6) + 1;
        tempPlayerScore += roll;
        return roll;
    }

    public void addScorePlayer() {
        playerScore += tempPlayerScore;
        tempPlayerScore = 0;
    }

    public int rollComputer() {
        int roll = (int)(Math.random() * 6) + 1;
        tempComputerScore += roll;
        return roll;
    }

    public void addScoreComputer() {
        computerScore += tempComputerScore;
        tempComputerScore = 0;
    }

    public boolean checkWinComputer() {
        if (computerScore >= 100) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean checkWinPlayer() {
        if (playerScore >= 100) {
            return (true);
        } else {
            return (false);
        }
    }
}
