package util.List;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {

    public static void addListTest() {
        System.out.println("Class ListAdd, method addListTest(): ");
        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add(null);
        stringList.add(2, "3");
        //stringList.add(5, "5"); //exception
        for (String element : stringList) {
            System.out.println(element + " ");
        }
    }
}
