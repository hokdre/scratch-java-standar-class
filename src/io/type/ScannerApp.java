package io.type;

import java.util.Scanner;

/**
 * Scanner is a utility to read IO that can be from file, console, etc
 * it's a object that waiting for input received and readed
 * nextLine(), nextInt(), nextLong(), nextBoolean()
 */

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Name :");
        String name = scan.nextLine();

        System.out.println("name is : " + name);
    }
}
