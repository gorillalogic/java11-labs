package whizlabs.test2.operators.question33;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.loop(0);
    }

    void loop(int number) {
        while (number-- < 0) {
            number++;
        }
        System.out.println(number);
    }
}
