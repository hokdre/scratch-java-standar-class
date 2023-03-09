package system;

/**
 * System utillity like os module in other language
 * currentTimeMillis() : current time in milis
 * nanoTime() : current time in nano second
 * getEnv() : get environment variable
 * exit() : kill app
 *
 */
public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        System.getenv("env name");
        System.exit(0);
    }
}
