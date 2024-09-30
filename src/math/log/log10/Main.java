package math.log.log10;

/**
 * Math.log(), Math.log10()
 * These methods return the natural logarithm and the base 10 logarithm of a number.
 */
public class Main {
    public static void main(String[] args) {
        double num = 100.0;

        System.out.println("Natural log of " + num + " is: " + Math.log(num)); // 4.605170185988092
        System.out.println("Base 10 log of " + num + " is: " + Math.log10(num)); // 2.0
    }
}
