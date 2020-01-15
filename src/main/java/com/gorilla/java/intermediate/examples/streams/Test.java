package com.gorilla.java.intermediate.examples.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test<T> {
    Logger logger;
    public static void main(String[] args) {

        Collection<String> collection = Arrays.asList("a", "b", "c");
        Stream<String> streamOfCollection = collection.stream();

        Stream<String> streamOfArray = Stream.of("a", "b", "c");

        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);

        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

        Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);

        Stream<Integer> stream = Stream.generate(() -> 0).limit(10);

        List<String> strList = stream.map(s -> s.toString()).collect(Collectors.toList());

        List<String> filteredList = stream.filter(s -> s > 0).map(s -> s.toString()).collect(Collectors.toList());

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }

    public Stream<T> streamOf(List<T> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}
