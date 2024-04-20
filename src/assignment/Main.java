package assignment;

import java.util.Scanner;

/**
 * Main class to calculate distance between two dots
 */
public class Main {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program will calculate distance between two dots");

        Dot dot1 = generateDot("dot 1");
        Dot dot2 = generateDot("dot 2");

        System.out.println("Distance: " + dot1.distanceTo(dot2));
    }

    /**
     * Generate dot from user input
     *
     * @param name dot name
     * @return dot object
     */
    private static Dot generateDot(String name) {
        System.out.println("Please input coordinate for " + name);

        long x = getInput("x", false);
        long y = getInput("y", false);

        return new Dot(x, y);
    }

    /**
     * Get input from user, if the input is invalid, it will ask for input again
     * until the input is valid
     *
     * @param name input name
     * @param invalidInput whether the previous input is invalid
     * @return input from user
     */
    private static long getInput(String name, boolean invalidInput) {
        Scanner scanner = new Scanner(System.in);

        if (invalidInput) {
            System.out.print("[Invalid input, please input valid number] ");
        }

        System.out.print(name + ": ");
        try {
            return scanner.nextLong();
        } catch (Exception e) {
            return getInput(name, true);
        }
    }

}


