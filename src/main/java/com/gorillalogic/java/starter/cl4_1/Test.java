package com.gorillalogic.java.starter.cl4_1;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Company gorillaLogic = new Company("Gorilla Logic", LocalDate.of(2002, 1, 1));
        gorillaLogic.setId("GL-FOR-EVER");
        System.out.println(gorillaLogic);

        Company gl = gorillaLogic.toBuilder().closeDate(LocalDate.now()).build();
        System.out.println(gl);

        System.out.println("Equals: " + gorillaLogic.equals(gl));
        System.out.println("Hashcode gorillaLogic: " + gorillaLogic.hashCode());
        System.out.println("Hashcode gl: " + gl.hashCode());
    }
}
