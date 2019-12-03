package com.gorillalogic.java.starter.cl5.map;

public class Test {
    public static void main(String[] args) {
        Map map = new Map();
        System.out.println("1." + map);
        map.put("First", 1);
        map.put("Second", 2);
        map.put("Third", 3);
        map.put("Fourth", 4);
        map.put("Fifth", 5);
        System.out.println(map);
        System.out.println("map[2]: " + map.get(2));
        System.out.println("map.get(Second): " + map.get("Second"));
        map.remove(3);
        System.out.println(map);
        map.remove("Third");
        System.out.println(map);
        map.put("First", 12);
        System.out.println(map);
    }
}
