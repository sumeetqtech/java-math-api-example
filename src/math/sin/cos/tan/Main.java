package math.sin.cos.tan;

/**
 * Math.sin(), Math.cos(), Math.tan()
 * These methods return the sine, cosine, and tangent of an angle (in radians).
 */
public class Main {
    public static void main(String[] args) {
        double angle = Math.PI / 4; // 45 degrees

        System.out.println("Sine of " + angle + " is: " + Math.sin(angle)); // 0.7071067811865475
        System.out.println("Cosine of " + angle + " is: " + Math.cos(angle)); // 0.7071067811865476
        System.out.println("Tangent of " + angle + " is: " + Math.tan(angle)); // 0.9999999999999999
    }
}