package com.gorillalogic.java.starter.cl6;

import java.util.Arrays;

public class ArrayList extends Group {
    public ArrayList() {
        elements = new Integer[CAPACITY];
    }

    @Override
    public void add(Integer element) {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = element;
    }
}

