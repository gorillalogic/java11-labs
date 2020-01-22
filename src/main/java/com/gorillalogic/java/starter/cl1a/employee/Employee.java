package com.gorillalogic.java.starter.cl1a.employee;

import com.gorillalogic.java.starter.cl1a.office.Office;

public class Employee {

    public String name = "Pepito";
    public Office office = new Office();

    public String toString(){
        return "Name: " + name + " - Office: " + office.toString();
    }

}
