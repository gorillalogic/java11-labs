package com.gorillalogic.java.starter.cl6;

import java.util.Arrays;

public abstract class Group implements List {
    protected final static int CAPACITY = 10;
    protected Integer[] elements;
    protected int size;

    @Override
    public Integer get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return elements[index];
    }

    @Override
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

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "Group{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ", capacity=" + elements.length +
                '}';
    }
}
