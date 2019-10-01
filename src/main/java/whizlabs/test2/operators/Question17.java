package whizlabs.test2.operators;

public class Question17 {

    /**
     * Multiplicative operators (*, /, %) have higher precedence than additive ones (+, -).
     * These all operators are evaluated from left to right.
     */
    public static void main(String[] args) {
        double x = 1, y = -2, z = 3;
        double t = x / y % (z + (x - y)) * z;
        System.out.println(t);
        /**
         * (z + (x - y)) -> (3 + (1 - -2)) -> (3 + (3)) -> (6)
         * x / y % (6) -> 1 / -2 % (6) -> -0.5 % (6) -> -0.5
         * -0.5 * z -> -0.5 * 3 -> -1.5
         * Result: -1.5
         */
    }
}

