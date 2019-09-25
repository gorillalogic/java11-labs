package whizlabs.test1.question50;

public class test {

    public static void main(String[] args) {
        Test test = new Test();
        String text1 = test.convert('a');
        String text2 = test.convert('b');
        System.out.println(text1 + text2);
    }

    String convert(char character) {
        String text;
        switch (character) {
            // Line 1
            case 'a':
                text = "A";
            case 'b':
                text = "B";
                break;
            case 'c':
                text = "C";
        }
        return text; // Line 2
    }
}