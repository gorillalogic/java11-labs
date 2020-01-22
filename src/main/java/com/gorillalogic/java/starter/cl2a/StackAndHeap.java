package com.gorillalogic.java.starter.cl2a;

public class StackAndHeap {

    public static void main(String ...args) {

//        Memory men1 = new Memory();
//        Memory men2 = men1;

        int i=1;
        Object obj = new Object();

        Memory mem = new Memory();
        mem.foo(obj);

    }

}

class Memory {

    public void foo(Object param) {
        String str = param.toString();
        System.out.println(str);
    }

}

