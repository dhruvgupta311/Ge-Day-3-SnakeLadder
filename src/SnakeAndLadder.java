import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int player1Pos = 0, player2Pos = 0;
        int winningPos = 100;
        int dieCount = 0;
        Random rand = new Random();

        System.out.println("Player 1 starts at position: " + player1Pos);
        System.out.println("Player 2 starts at position: " + player2Pos);

        while (player1Pos < winningPos && player2Pos < winningPos) {
            int dieRoll = rand.nextInt(6) + 1;
            int option1 = rand.nextInt(3);
            int option2 = rand.nextInt(3);

            dieCount++;
            System.out.println("Roll #" + dieCount);

            // Player 1 turn
            System.out.println("Player 1 rolls the die and gets: " + dieRoll);
            switch (option1) {
                case 0:
                    System.out.println("No Play: Player 1 stays at position " + player1Pos);
                    break;
                case 1:
                    if (player1Pos + dieRoll <= winningPos) {
                        player1Pos += dieRoll;
                        System.out.println("Ladder: Player 1 moves ahead to position " + player1Pos);
                    } else {
                        System.out.println("Ladder: Player 1 stays at position " + player1Pos);
                    }
                    break;
                case 2:
                    player1Pos -= dieRoll;
                    if (player1Pos < 0) {
                        player1Pos = 0;
                    }
                    System.out.println("Snake: Player 1 moves behind to position " + player1Pos);
                    break;
            }

            if (player1Pos == winningPos) {
                break;
            }

            System.out.println("Player 2 rolls the die and gets: " + dieRoll);
            switch (option2) {
                case 0:
                    System.out.println("No Play: Player 2 stays at position " + player2Pos);
                    break;
                case 1:
                    if (player2Pos + dieRoll <= winningPos) {
                        player2Pos += dieRoll;
                        System.out.println("Ladder: Player 2 moves ahead to position " + player2Pos);
                    } else {
                        System.out.println("Ladder: Player 2 stays at position " + player2Pos);
                    }
                    break;
                case 2:
                    player2Pos -= dieRoll;
                    if (player2Pos < 0) {
                        player2Pos = 0;
                    }
                    System.out.println("Snake: Player 2 moves behind to position " + player2Pos);
                    break;
            }
        }

        if (player1Pos == winningPos) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }

        System.out.println("Total number of die rolls: " + dieCount);
    }
}
