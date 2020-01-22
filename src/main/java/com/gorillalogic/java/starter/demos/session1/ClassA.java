/*
 * Demo-1: Create a simple class without variables nor methods. Explain the class structure.
 * Demo-2: Create a variable of String type with name "className". Explain the variable structure.
 * Demo-3: Create "Setter" and "Getter" methods. Explain the method structure.
 * Demo-4: Compile the class via terminal. Explain the resulting files.
 * Demo-5: Run class, and explain the error "no main methods" and what it is. Add main method. Explain "main" method structure.
 *
 */

//Package...
package com.gorillalogic.java.starter.demos.session1;

//Imports...

//Class structure definition
public class ClassA {

    //Variables
    String className = "ClassA";

    //Methods...
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    //Main Method...
    public static void main(String args[]) {

        ClassA classA = new ClassA();

        System.out.println("Hello Javeros from: " + classA.getClassName());

    }

}



