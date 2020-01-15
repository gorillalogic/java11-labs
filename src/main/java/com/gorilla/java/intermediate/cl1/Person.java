package com.gorilla.java.intermediate.cl1;

import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Data
public class Person {
    private static Date birthday;
    private String id;
    private String name;
    private String phone;

    @Getter
    public static class PersonAge {
        private final Integer value;

        public PersonAge() {
            if (birthday != null) {
                long diffInMillies = Math.abs(new Date().getTime() - birthday.getTime());
                value = (int) TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS) / 365;
            } else {
                value = null;
            }
        }
    }

    @Getter
    public class PersonStatus {
        private final EPersonStatus value;

        public PersonStatus() {
            if (id == null) {
                value = EPersonStatus.NEW;
            } else {
                value = EPersonStatus.OLD;
            }
        }
    }
}
