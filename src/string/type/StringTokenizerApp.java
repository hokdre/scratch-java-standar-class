package string.type;

import java.util.StringTokenizer;

/**
 * Background issue:
 * When split string, it will be split all string in one time that can be memory issue
 * Maybe we need to lazy load the string (worst case if delimeter is not found, it will load all string in one time)
 */
public class StringTokenizerApp {
    public static void main(String[] args) {

        String name = "a b c";

        StringTokenizer tokenizer = new StringTokenizer(name, " "); // 3 stop point : a,b,c
        while (tokenizer.hasMoreTokens()) {
            String res = tokenizer.nextToken();
            System.out.println(res);
        }

        StringTokenizer tokenizerNotStopPoint = new StringTokenizer(name, ","); // 1 stop point : a b c
        while (tokenizerNotStopPoint.hasMoreTokens()) {
            String res = tokenizerNotStopPoint.nextToken();
            System.out.println(res);
        }
    }
}
