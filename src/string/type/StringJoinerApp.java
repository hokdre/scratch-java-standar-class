package string.type;

import java.util.StringJoiner;

/**
 * Utility to construct formatted string
 */
public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(",", "[","]");
        sj.add("a");
        sj.add("b");
        sj.add("c");
        String res = sj.toString();
        System.out.println(res); // "[a,b,c]"
    }
}
