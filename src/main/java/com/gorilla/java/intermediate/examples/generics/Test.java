package com.gorilla.java.intermediate.examples.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        Long x = list.iterator().next();
    }
}
