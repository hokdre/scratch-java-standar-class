package utility.type;

import java.util.Random;

/**
 * Random value
 */

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 1000;
        int ran = random.nextInt(max);
    }
}
