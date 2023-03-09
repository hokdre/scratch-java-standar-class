package string.type;

import java.nio.CharBuffer;

/**
 * Like other language String in java is immutable
 * So when we do concate/update we create new String
 * In Java we know 2 type of empty value :
 * White Space isBlank = true, isEmpty = false
 *
 */
public class StringApp {
    public static void main(String[] args) {

        String name = "abc";

        // empty string
        Boolean empty =  "".isEmpty(); // true

        // blank string
        Boolean blank = " ".isBlank(); // true

        // to lower
        String nameLower = name.toLowerCase();

        // to upper
        String nameUpper  = name.toUpperCase();

        // contains
        String name1 = "abc";
        Boolean isContain = name.contains(name1);

        // split
        String[] strs = name.split("");
    }
}
