import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int playerPos = 0;
        Random rand = new Random();
        int dieRoll = rand.nextInt(6) + 1;
        System.out.println("Player starts at position: " + playerPos);
        System.out.println("Player1 rolls the die and gets: " + dieRoll);
    }
}
