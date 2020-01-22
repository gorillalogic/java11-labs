package com.gorillalogic.java.starter.demos.session2;

public class Inheritance {

    public static void main(String... args) {
        Person person = new Person();      // Instance of super class
        System.out.println("Person age: " + person.age);

        Engineer engineer = new Engineer();
        System.out.println("Engineer age: " + engineer.age);

        Doctor doctor = new Doctor();
        System.out.println("Doctor age: " + doctor.age);
    }

}

class Person {
    int age;

    public Person() {
        age = 10;
    }
}

class Engineer extends Person{
    public Engineer() {
        age = 25;
    }
}

class Doctor extends Person {
    public Doctor() {
        age = 40;
    }
}




//    Person person2 = new Engineer();    // Instance of sub-class but with reference of super class
//    Person person3 = new Doctor();      // Instance of sub-class but with reference of super class