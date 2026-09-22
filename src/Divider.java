// Simple utility class that provides a divide method.
public class Divider {
    /**
     * Return the quotient of two integers.
     */
    public static int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return x / y;
    }
}
