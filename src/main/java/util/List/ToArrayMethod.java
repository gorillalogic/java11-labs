package util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayMethod {

    public static void toArrayFromList() {
        System.out.println("Class ToArrayMethod, method toArrayFromList(): ");
        List<String> list = new ArrayList<>(List.of("A", "B"));
        Object[] array2 = list.toArray();
        System.out.println(Arrays.toString(array2));
    }

    public static void toArrayFromArrayNotBigEnough() {
        System.out.println("Class ToArrayMethod, method toArrayFromArrayNotBigEnough(): ");
        List<String> list = new ArrayList<>(List.of("L", "I"));
        String[] array1 = {"C"};
        String[] array2 = list.toArray(array1);
        array1[0] = "D";
        System.out.println(Arrays.toString(array2));
    }

    public static void toArrayFromArrayBigEnough() {
        System.out.println("Class ToArrayMethod, method toArrayFromArrayBigEnough(): ");
        List<String> list = new ArrayList<>(List.of("S", "T"));
        String[] array1 = {"C", "D"};
        String[] array2 = list.toArray(array1);
        array1[1] = "E";
        System.out.println(Arrays.toString(array2));
    }

    public static void toArrayFromArrayBigger() {
        System.out.println("Class ToArrayMethod, method toArrayFromArrayBigger(): ");
        List<String> list = new ArrayList<>(List.of("S", "T"));
        String[] array1 = {"E"};
//        String[] array1 = null; //exception
        String[] array2 = list.toArray(array1);
        array1[0] = "G";
        System.out.println(Arrays.toString(array2));
        System.out.println(array1.equals(array2));
    }
}
