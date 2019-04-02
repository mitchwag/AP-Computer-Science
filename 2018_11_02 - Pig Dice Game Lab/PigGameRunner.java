import java.util.Scanner;

public class PigGameRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        do {
            PigGame round = new PigGame();

            //  *** START COMPUTER TURN ***  //
            //  Computer rolls 3 times
            for (int i = 0; i < 3; i++) {
                int roll = round.rollComputer();

                System.out.println("Computer rolls: " + roll);

                //  If 1 -> no points, If 2-6 -> add points
                if (roll == 1) {
                    System.out.println("Computer didn't earn any points!");
                    break;
                } else if (i == 2) {
                    round.addScoreComputer();
                }
            }

            //  Display score
            System.out.println("=====================" +
                    "\nComputer Score: " + round.computerScore +
                    "\nYour Score: " + round.playerScore +
                    "\n=====================");

            //  Check if computer wins
            if (round.checkWinComputer()) {
                System.out.println("COMPUTER WINS!");
                break;
            }
            //  *** END COMPUTER TURN ***  //

            //  *** START USER TURN ***  //
            //  Continue until user wants to stop
            do {
                System.out.println("Roll die? (Y/N)");
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("y")) {
                    int roll = round.rollPlayer();

                    System.out.println("You roll: " + roll);

                    //  If 1 -> no points/end round, If 2-6 -> add points
                    if (roll == 1) {
                        System.out.println("Sorry, you don't earn any points!");
                        break;
                    } else {
                        System.out.println("Current Cumulative Score: " + round.tempPlayerScore +
                                "\n-------");
                    }
                } else {
                    round.addScorePlayer();
                    break;
                }

            } while(true);

            //  Display score
            System.out.println("=====================" +
                    "\nComputer Score: " + round.computerScore +
                    "\nYour Score: " + round.playerScore +
                    "\n=====================");

            //  Check if computer wins
            if (round.checkWinPlayer()) {
                System.out.println("YOU WIN!");
                break;
            }
            //  *** END USER TURN ***  //
        } while(true);
    }
}
