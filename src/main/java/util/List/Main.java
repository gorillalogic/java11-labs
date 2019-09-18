package util.List;
/**
 * Module java.base
 * Package java.util
 * util.List is an interface not a class
 * https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
 */
public class Main {

    public static void main(String[] args) {

        ListAdd.addListTest();

        ImmutableLists.listOf();

        ImmutableLists.listOf2();

        ImmutableLists.listCopyOf();

        ToArrayMethod.toArrayFromList();

        ToArrayMethod.toArrayFromArrayNotBigEnough();

        ToArrayMethod.toArrayFromArrayBigEnough();

        ToArrayMethod.toArrayFromArrayBigger();
    }

}
