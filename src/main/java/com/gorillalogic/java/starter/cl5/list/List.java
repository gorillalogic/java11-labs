package com.gorillalogic.java.starter.cl5.list;

import java.util.Arrays;

public class List {
    private final static int CAPACITY = 10;
    private Integer[] elements;
    private int size;

    public List() {
        elements = new Integer[CAPACITY];
    }

    public Integer get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return elements[index];
    }

    public void add(Integer element) {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = element;
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
        return "List{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + elements.length + '}';
    }
}
