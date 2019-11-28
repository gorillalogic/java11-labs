package com.gorillalogic.java.starter.cl6;

public interface List extends Collection {
    Integer get(int index);

    default void addAll(List other) {
        if (other != null && !other.isEmpty()) {
            int size = other.size();
            for (int i = 0; i < size; i++) {
                add(other.get(i));
            }
        }
    }
}
