package math.round.ceil.floor;

/**
 * Math.round(), Math.ceil(), Math.floor()
 * These methods round a number to the nearest integer, round up, and round down, respectively.
 */
public class Main {
    public static void main(String[] args) {
        double num = 5.75;

        System.out.println("Rounded value of " + num + " is: " + Math.round(num)); // 6
        System.out.println("Ceiling value of " + num + " is: " + Math.ceil(num)); // 6.0
        System.out.println("Floor value of " + num + " is: " + Math.floor(num)); // 5.0
    }
}
