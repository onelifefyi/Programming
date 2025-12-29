import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number;

        // This doesn't include 6, the start is inclusive, end is not
        // number = random.nextInt(1, 6);

        // fixed
        number = random.nextInt(1, 7);
        System.out.println(number);

        // for decimal number
        // generates a random number between 0 & 1 (1 exclusive)
        double rNum = random.nextDouble();
        System.out.println(rNum);

        // can generate boolean as well
        boolean coinFlip = random.nextBoolean();
        System.out.println(coinFlip);
    }
}
