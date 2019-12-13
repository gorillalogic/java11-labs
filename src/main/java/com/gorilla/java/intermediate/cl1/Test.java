package com.gorilla.java.intermediate.cl1;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        Person.PersonStatus status = person.new PersonStatus();
        person.setId("1");
        System.out.println(status.getValue());
    }

}
