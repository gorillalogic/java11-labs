package com.gorilla.java.intermediate.cl1;

import java.util.Date;

public class Test {

    public static void main(String[] args) {
        Person person = new Person();
        Person.PersonStatus status = person.new PersonStatus();
        person.setId("1");
        System.out.println(status.getValue());

        Person.PersonAge age = new Person.PersonAge();
        System.out.println(age.getValue());

        Person.PersonStatus anonymousStatus = person.new PersonStatus() {
            public String getTranslation() {
                EPersonStatus status = super.getValue();
                return status == null ?
                        EPersonStatus.UNDEFINED.getTranslation() :
                        status.getTranslation();
            }

            @Override
            public String toString() {
                return "AnonymousStatus {" + getTranslation() + "}";
            }
        };
        System.out.println(anonymousStatus);

        IRandom random = new IRandom() {
            @Override
            public long getRandomNumber() {
                return new Date().getTime();
            }

            @Override
            public String toString() {
                return "IRandom {" + getRandomNumber() + "}";
            }
        };
        System.out.println(random);
    }

}
