package utility.type;

import java.util.Arrays;

/**
 * Utility to operation for array of data like :
 * searching, copy, equals, sort, toString, etc
 */
public class ArraysApp {
    public static void main(String[] args) {
        int[] ints = {
                4,5,6
        };

        // sorting
        // for primitive is doesn't support descending
        Arrays.sort(ints);

        // copy
        int[] res = Arrays.copyOfRange(ints, 1, 2); // [5]

    }
}
