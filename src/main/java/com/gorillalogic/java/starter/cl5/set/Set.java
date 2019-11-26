package com.gorillalogic.java.starter.cl5.set;

import java.util.Arrays;

public class Set {
    private final static int CAPACITY = 10;
    private Integer elements[];
    private int size;

    public Set() {
        elements = new Integer[CAPACITY];
    }

    public Integer get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return elements[index];
    }

    public void add(Integer element) {
        if (!exists(element)) {
            if (size == elements.length) {
                int newSize = elements.length * 2;
                elements = Arrays.copyOf(elements, newSize);
            }
            elements[size++] = element;
        }
    }

    private boolean exists(Integer element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i]))
                return true;
        }
        return false;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        elements[size] = null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Set{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + elements.length + '}';
    }
}
