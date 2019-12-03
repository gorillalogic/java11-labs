package com.gorillalogic.java.starter.cl5.set;

public class Test {
    public static void main(String[] args) {
        Set set = new Set();
        System.out.println(set);
        int i = 0;
        while (i < 15) {
            set.add(i * 2);
            i++;
        }
        System.out.println(set);
        System.out.println("set[10]: " + set.get(10));
        set.remove(10);
        System.out.println(set);
        set.add(30);
        set.add(30);
        System.out.println(set);
    }
}
