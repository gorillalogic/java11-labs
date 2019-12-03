package com.gorillalogic.java.starter.cl5.map;

import java.util.Arrays;

public class Map {
    private static final int CAPACITY = 16;
    private Entry[] elements;
    private int size;

    public Map() {
        elements = new Entry[CAPACITY];
    }

    public Integer get(String key) {
        for (int i = 0; i < size; i++)
            if (key.equals(elements[i].key))
                return elements[i].value;
        return null;
    }

    public String get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return elements[index].toString();
    }

    public void put(String key, Integer value) {
        remove(key);
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        elements[size++] = new Entry(key, value);
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

    public void remove(String key) {
        int index = indexOf(key);
        if (index >= 0)
            remove(index);
    }

    public int size() {
        return size;
    }

    private int indexOf(String key) {
        for (int i = 0; i < size; i++) {
            if (key.equals(elements[i].key))
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Map{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                ",capacity=" + elements.length + '}';
    }


    private class Entry {
        final String key;
        Integer value;

        public Entry(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Entry{" +
                    "key='" + key + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
}
