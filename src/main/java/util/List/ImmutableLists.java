package util.List;

import java.util.ArrayList;
import java.util.List;

public class ImmutableLists {

    public static void listOf() {
        System.out.println("Class ImmutableLists, method listOf(): ");
        //String[] array = {"Hello", "World!", null}; //Throw an exception because it has a null in the array
        String[] array = {"Hello", "World!"};
        List<String[]> listOf = List.<String[]>of(array); //Since Java 9
        //listOf.add(array); //Throw Exception because we can't modify the list.
        for (String[] element : listOf) {
            for (int i = 0; i < element.length; i++) {
                System.out.println(element[i] + " ");
            }
        }
        System.out.println("size " + listOf.size());
    }

    public static void listOf2() {
        System.out.println("Class ImmutableLists, method listOf2(): ");
        //String[] array = {"Hello", null, "World!"}; //Throw an exception because it has a null in the array
        String[] array = {"Hello", "World!"};
        List<String> listOf2 = List.<String>of(array);
        //listOf2.add(array[0]); //Throw Exception because we can't modify the list
        for (String element : listOf2) {
            System.out.println(element + " ");
        }
        System.out.println("size " + listOf2.size());
    }

    public static void listCopyOf() {
        System.out.println("Class ImmutableLists, method listCopyOf(): ");
        //util.List.copyOf Since Java 10
        //If the given Collection is an unmodifiable util.List, calling copyOf will generally not create a copyList.
        String[] array = {"Hello", "World!"};
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        List<String> copyList = List.copyOf(stringList);
        //copyList.add(array[0]); //Throw Exception because we can't modify the list
        for (String element : copyList) {
            System.out.println(element + " ");
        }
        System.out.println(stringList == copyList);

        List<String> listOf2 = List.<String>of(array);
        List<String> copyList2 = List.copyOf(listOf2);
        for (String element : copyList2) {
            System.out.println(element + " ");
        }
        System.out.println(listOf2 == copyList2);
    }

}
