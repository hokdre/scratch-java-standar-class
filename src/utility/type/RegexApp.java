package utility.type;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        String data = "abcdef bcd";

        // create pattern
        // finding word that start with a-z or A-Z not mandatory
        // after that find in the middle has a mandator
        // and in the end has  a-z or A-Z not mandatory
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");

        // search
        Matcher matcher = pattern.matcher(data);

        while (matcher.find()) {
            String result = matcher.group();
            System.out.println(result); // abcdef
        }
    }
}
