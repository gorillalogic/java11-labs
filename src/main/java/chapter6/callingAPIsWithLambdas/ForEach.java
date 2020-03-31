package chapter6.callingAPIsWithLambdas;

import java.util.*;

/*
    It takes a Consumer and calls that lambda
    for each element encountered.
 */
public class ForEach {

    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");

        System.out.println("-----For each on a List-----");
        bunnies.forEach(b -> System.out.println(b));
        System.out.println(bunnies);

        /*
            We can use forEach() with a Set or Map
         */
        System.out.println("-----For each on a Set-----");
        Set<String> bunniesSet = Set.of("long ear", "floppy", "hoppy");
        bunniesSet.forEach(b -> System.out.println(b));

        /*
            For a Map, we have to choose whether you want to go
            though thee keys or values:
         */
        System.out.println("-----For each on a Map-----");
        Map<String, Integer> bunniesMap = new HashMap<>();
        bunniesMap.put("long ear", 3);
        bunniesMap.put("floppy", 8);
        bunniesMap.put("hoppy", 1);

        //It turns out the keySet() and values() methods each return a Ser.
        //Since we know how to use forEach() with a Set, this is easy.
        bunniesMap.keySet().forEach(b -> System.out.println(b));
        bunniesMap.values().forEach(b -> System.out.println(b));

        /**
         *  Real World Scenario
         *
         *  Using forEach() with a Map Directly
         *
         *  Note: we don't need to know this for the exam.
         *
         *  Java has a functional interface called BiConsumer.
         *  It works just like Consumer except it can take two parameters.
         *  This functional interface allows you use forEach() with key/value pairs from Map.
         */

        System.out.println("-----For each on a Map with a BiConsumer-----");
        Map<String, Integer> bunniesMap2 = new HashMap<>();
        bunniesMap2.put("long ear", 3);
        bunniesMap2.put("floppy", 8);
        bunniesMap2.put("hoppy", 1);

        bunniesMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
