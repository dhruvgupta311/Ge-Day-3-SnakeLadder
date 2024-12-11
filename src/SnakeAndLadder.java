import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPos = 0;
        Random rand = new Random();

        int dieRoll = rand.nextInt(6) + 1;
        int option = rand.nextInt(3);

        System.out.println("Player rolls the die and gets: " + dieRoll);

        switch (option) {
            case 0:
                System.out.println("No Play: Player stays at position " + playerPos);
                break;
            case 1:
                playerPos += dieRoll;
                System.out.println("Ladder: Player moves ahead to position " + playerPos);
                break;
            case 2:
                playerPos += dieRoll;
                if (playerPos < 0) {
                    playerPos = 0;
                }
                System.out.println("Snake: Player moves behind to position " + playerPos);
                break;
        }
    }
}
