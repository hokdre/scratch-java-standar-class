package string.type;

/**
 * Background issue :
 * Like we known, String is immutable. so basicly when do update operation we create new String.
 * That will become memory issue in big chunk of String
 * StringBuffer and StringBuilder is come to that issue.
 *
 * What's different?
 * StringBuffer is thread safe / safe to parallel execution, slow
 * StringBuilder is not safe for parallel execution, fast
 */
public class StringBufferBuilderApp {
    public static void main(String[] args) {
        // builder
        StringBuilder sb = new StringBuilder();
        // concat
        sb.append("abc");
        sb.append("de");
        // replace, index start from 0
        sb.replace(0,1, "f");
        // generate
        String res = sb.toString(); //fbcde
        System.out.println(res);

        // buffer
        StringBuffer bf = new StringBuffer();
        // concat
        bf.append("abc");
        bf.append("de");

        // replace, index start from 0
        bf.replace(0,1,"f");
        //generate
        String res1 = bf.toString();
        System.out.println(res1); //fbcde

    }
}
