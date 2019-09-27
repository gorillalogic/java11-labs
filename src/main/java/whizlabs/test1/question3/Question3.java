package whizlabs.test1.question3;

public class Question3 {

    public static void main(String[] args) {

        //Domain : Working with Java Arrays
        String[][] strings = {{"a", "d"}, {"b", "e"}, {"c", "f"}};
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                System.out.print(strings[i][j] + " ");
            }
            System.out.println();
        }
    }
}
