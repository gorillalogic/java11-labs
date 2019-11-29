package com.gorillalogic.java.starter.cl7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(13,15,9,25,25);
        System.out.println(list);

        Iterator listIterator = list.iterator();
        while(listIterator.hasNext())
            System.out.println(listIterator.next());

        Set<Integer> set = new LinkedHashSet<>(list);
        System.out.println(set);

        Set<Person> personSet = new HashSet<>(3);
        personSet.add(new Person(123, "Person1"));
        personSet.add(new Person(123, "Person1"));
        personSet.add(new Person(456, "Person1"));
        personSet.add(new Person(789, "Person2"));
        personSet.add(new Person(789, "Person3"));
        System.out.println(personSet);

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(123, new Person(123, "Person1"));
        personMap.put(123, new Person(123, "Person1"));
        personMap.put(456, new Person(456, "Person1"));
        personMap.put(789, new Person(789, "Person2"));
        personMap.put(789, new Person(789, "Person3"));
        personMap.put(100, new Person(789, "Person3"));
        System.out.println(personMap);
    }
}
