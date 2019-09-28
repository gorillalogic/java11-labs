package whizlabs.test2.operators;

public class Question64 {

    public static void main(String[] args) {
        int sum = 0;
        myLabel:
        do {
            for (int i = 0; i < 5; i++) {
                if (i % 2 == 0) continue;
                sum += i;
            }
        } while (sum < 15);
        System.out.println(sum);
    }
}
