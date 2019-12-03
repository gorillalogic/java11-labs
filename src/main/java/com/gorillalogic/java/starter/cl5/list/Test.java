package com.gorillalogic.java.starter.cl5.list;

public class Test {
    public static void main(String[] args) {
        List list = new List();
        System.out.println(list);
        int i = 0;
        while (i < 15) {
            list.add(i * 2);
            i++;
        }
        System.out.println(list);
        System.out.println("list[10]: " + list.get(10));
        list.remove(10);
        System.out.println(list);
        list.add(30);
        list.add(30);
        System.out.println(list);
    }
}
