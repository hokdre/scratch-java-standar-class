package number.type;

/**
 * non primitive number is extend from Number class
 * that has method to converting to number to number:
 * byteValue(), doubleValue(), floatValue(), intValue(), longValue(), shortValue()
 *
 * string to number :
 * Primitive : XXX.parseXXX(str)
 * Non Primitive = XXX.valueOf(str)
 */
public class NumberApp {
    public static void main(String[] args) {
        Integer num = 5;

        // number to number
        Long longNum = num.longValue();
        Byte byteNume = num.byteValue();

        // string to number
        String ex = "1";
        int primitive = Integer.parseInt(ex);
        Integer nonPrimitive = Integer.valueOf(ex);
    }
}
