package com.gorillalogic.java.starter.cl6;

import java.util.Arrays;

public class Set extends Group {
    public Set() {
        elements = new Integer[CAPACITY];
    }

    @Override
    public void add(Integer element) {
        if (!exists(element)) {
            if (size == elements.length) {
                int newSize = elements.length * 2;
                elements = Arrays.copyOf(elements, newSize);
            }
            elements[size++] = element;
        }
    }

    public boolean exists(Integer element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i]))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Set{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + elements.length +
                '}';
    }
}

