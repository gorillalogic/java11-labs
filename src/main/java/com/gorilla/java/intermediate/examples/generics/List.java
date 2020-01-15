package com.gorilla.java.intermediate.examples.generics;

import java.util.Iterator;

public interface List<T> {
    boolean add(T t);

    Iterator iterator(T t);

    void print(List<? super Integer> list);
}
