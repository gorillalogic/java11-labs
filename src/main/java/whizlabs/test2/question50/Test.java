package whizlabs.test2.question50;

public class Test {

    public static void main(String[] args) {
//        Test test = new Test();
//        String text1 = test.convert('a');
//        String text2 = test.convert('b');
//        System.out.println(text1 + text2);
    }

    /**
     * The switch statement doesn't have a default label, meaning it doesn't cover all the allowable values of
     * the character variable. As a result, the text variable might not be initialized before the convert method
     * returns (when character isn't a, b or c). This possible un-initialization state leads to a compile-time error.
     */
    //Answer -> Compilation fails on line 2
//    String convert(char character) {
//        String text;
//        switch (character) {
//            // Line 1
//            case 'a':
//                text = "A";
//            case 'b':
//                text = "B";
//                break;
//            case 'c':
//                text = "C";
//        }
//        return text; // Line 2
//    }
}