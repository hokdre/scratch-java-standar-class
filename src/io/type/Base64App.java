package io.type;

import java.util.Base64;

/**
 * Base64 : encoding binary to safe text
 */
public class Base64App {
    public static void main(String[] args) {
        String orignal = "abc";

        // encode
        String encoded = Base64.getEncoder().encodeToString(orignal.getBytes());

        // decode
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String dedcoded = new String(bytes);
    }
}
