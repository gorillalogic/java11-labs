package whizlabs.test2.operators;

public class Question50 {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            if (i % 3 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
