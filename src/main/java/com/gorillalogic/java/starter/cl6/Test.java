package com.gorillalogic.java.starter.cl6;

public class Test {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(13);
        arrayList.add(15);
        arrayList.add(9);
        arrayList.add(25);
        arrayList.add(25);
        System.out.println(arrayList);

        Set set = new Set();
        set.addAll(arrayList);
        System.out.println(set);

        Group group = set;
        group.add(10);
        System.out.println(group);
        System.out.println(set);

        List list = set;
        list.add(11);
        System.out.println(list);
        System.out.println(set);

        Collection collection = set;
        collection.add(13);
        System.out.println(collection);
        System.out.println(set);

        //collection.exists(11);
        //collection.addAll(set);
        Object object = new Set();
        System.out.println("object instanceof Collection: " + (object instanceof Collection));
        System.out.println("object instanceof ArrayList: " + (object instanceof ArrayList));
    }
}
