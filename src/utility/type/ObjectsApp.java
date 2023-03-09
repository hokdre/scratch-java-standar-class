package utility.type;

import java.util.Date;
import java.util.Objects;

/**
 * Objects is class that contains utility to  with safe way
 * like call to string, hashcode, and equals
 */
public class ObjectsApp {
    public static void main(String[] args) {

        Objects.toString(new Date());
        Objects.hashCode(new Date());
        Objects.equals(new Date(), new Date());
    }
}
