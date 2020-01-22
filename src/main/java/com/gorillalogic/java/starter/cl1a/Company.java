//Package...
package com.gorillalogic.java.starter.cl1a;

//Imports...
import com.gorillalogic.java.starter.cl1a.employee.Employee;
import com.gorillalogic.java.starter.cl1a.office.Office;

//Class definition...
public class Company {

    //Main method...
    public static void main(String args[]){

        System.out.println("Hello Moto!");

        Office office1 = new Office();
        System.out.println("Is a Office class: " +  (office1 instanceof Office));

        Employee employee1 = new Employee();
        System.out.println(employee1.toString());

        System.out.println("The name of the company is: " + args[0]);

    }

}
