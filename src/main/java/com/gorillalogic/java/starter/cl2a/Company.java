package com.gorillalogic.java.starter.cl2a;

import java.util.Objects;

public class Company implements Cloneable {

    {
        System.out.println("#1 - CodeBlock executed: id= " + this.id + " - name= " + this.name);
    }

    String id = "GL";
    String name;

//    Forcing constructor overloaded by commenting default constructor
//    public Company() {}

    public Company(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Company(String name) {
        System.out.println("#2 - Start constructor execution: id= " + id + " - name= " + this.name);
        this.name = name;
        System.out.println("#3 - End constructor execution: id= " + id + " - name= " + this.name);
    }


    {
        System.out.println("#4 - CodeBlock executed: id= " + this.id + " - name= " + this.name);
    }


    public static void main(String ... args) {
        System.out.println("#5 - Start main method execution");
        Company company = new Company("Gorilla Logic");
        System.out.println("#6 - End main method execution");

        try {

            Company company2 = company;
            Company company3 = (Company) company2.clone();
            Class cls = company3.getClass();

            System.out.println("company == company2 : " + (company == company2));
            System.out.println("company.equals(company2) : " + company.equals(company2));
            System.out.println("company2 == company3 : " + (company2 == company3));
            System.out.println("company2.equals(company3) : " + company2.equals(company3));
            System.out.println("toString() : " + company3);
            System.out.println("Class : " + cls);

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(id, company.id) &&
                Objects.equals(name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Company{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}

