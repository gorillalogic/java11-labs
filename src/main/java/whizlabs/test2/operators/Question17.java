package whizlabs.test2.operators;

public class Question17 {

    public static void main(String[] args) {
        double x = 1, y = -2, z = 3;
        double t = x / y % (z + (x - y)) * z;
        System.out.println(t);
    }
}

