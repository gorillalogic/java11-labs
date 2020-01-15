package com.gorilla.java.intermediate.examples.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SortedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
}

