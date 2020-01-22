package com.gorillalogic.java.starter;

//Imports...

public class AClass {

    String className = "AClass";

    String getClassName(){
        return className;
    }

    void setClassName(String className){
        this.className = className;
    }


    public static void main(String args[]) {

        AClass ac = new AClass();
        BClass bc = new BClass();

        // Using reference variable
        System.out.println("Hello from: " + ac.getClassName());

        // Alternative
        System.out.println("Hello from: " + (new AClass()).getClassName());
        System.out.println("Hello from: " + (new BClass()).getClassName());

    }

    // Methods
    public String toString() {
        return "AClass{ className='" + className + " }";
    }

}

class BClass {

    String className = "BClass";

    String getClassName() {
        return className;
    }

    void setClassName(String className) {
        this.className = className;
    }

}

