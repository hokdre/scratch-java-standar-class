package number.type;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/**
 * If you need better precission point
 * Big decimal is more recommended rather that float
 */

public class BigNumAndDecApp {
    public static void main(String[] args) {

        // integer
        BigInteger i = new BigInteger("1");
        BigInteger j = new BigInteger("1");
        BigInteger res1 = i.add(j);
        System.out.println(res1);

        // float
        BigDecimal a = new BigDecimal(1);
        BigDecimal b= new BigDecimal(3);
        BigDecimal res = a.divide(b, MathContext.DECIMAL128);
        System.out.println(res); // 0.3333333... in float it will be 0.3333334
    }
}
