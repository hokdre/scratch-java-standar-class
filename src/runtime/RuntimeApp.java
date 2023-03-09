package runtime;

/**
 * Runtime is a class that can give as information about our current running environments
 * System class in under hood using this class
 * We can use this class to profilling and monitoring like :
 * total core cpus, free memory jvm, total memory jvm, max memory jvm and do gerbage collection
 */
public class RuntimeApp {
    public static void main(String[] args) {
        Runtime rn = Runtime.getRuntime();

        System.out.println(rn.availableProcessors());
        System.out.println(rn.freeMemory());
        System.out.println(rn.totalMemory());
        System.out.println(rn.maxMemory());

    }
}
