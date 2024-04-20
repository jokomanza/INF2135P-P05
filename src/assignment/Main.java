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

        System.out.println("Distance: " + calculateDistance(dot1, dot2));
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
     * Get input from user
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

    /**
     * Calculate distance between two dots
     *
     * @param dot1 first dot
     * @param dot2 second dot
     * @return distance between two dots
     */
    private static double calculateDistance(Dot dot1, Dot dot2) {
        long x1 = dot1.getX();
        long y1 = dot1.getY();

        long x2 = dot2.getX();
        long y2 = dot2.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

}


