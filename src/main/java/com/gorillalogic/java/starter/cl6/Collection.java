package com.gorillalogic.java.starter.cl6;

public interface Collection {
    void add(Integer element);

    void remove(int index);

    int size();

    default boolean isEmpty() {
        return size() == 0;
    }
}

