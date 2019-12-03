package com.gorillalogic.java.starter.cl8;

public class Test {
    public static void main(String[] args) {
        try {
            Company company = null;
            try {
                company.getId();
            } catch (NullPointerException e) {
                System.out.println(e);
            }
            CompanyValidator.validate(company);
        } catch (InvalidArgumentException e) {
            System.out.println(e);
        } finally {
            System.out.println("We need to ensure this line will be executed always");
        }
        System.out.println("This is the end of the method");
    }
}

/*
* Company company = Company.builder().name("Gorilla Logic").startDate(LocalDate.now()).build();
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
*
* */