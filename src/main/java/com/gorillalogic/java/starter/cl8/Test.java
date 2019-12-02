package com.gorillalogic.java.starter.cl8;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Company company = Company.builder().name("Gorilla Logic").startDate(LocalDate.now()).build();
        try {
            System.out.println("Company.id.trim " + company.getId().trim());
            CompanyValidator.validate(company);
        } catch (InvalidArgumentException e) {
            System.out.println(e);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            System.out.println("This is in the finally block");
        }
    }
}
