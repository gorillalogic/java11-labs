package whizlabs.test2.operators;

public class Question11 {

    public static void main(String[] args) {
        int x = 1, y = 2;
        x += x < y ? y : x;
        y = x < y ? y - x : y + x;
        System.out.println(x + " " + y);
    }
}
