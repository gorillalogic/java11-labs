package com.gorillalogic.java.starter.demos.session2;

public class Polymorphism {
    public static void main(String args[]) {
        Shape shape1;

        shape1 = new Rectangle();   // UpCasting
        shape1.draw();

        shape1 = new Circle();
        shape1.draw();

        Shape shape2 = new Rectangle();
        Rectangle rectangle1 = (Rectangle) shape2;   // DownCasting, developer knows what he/she is doing
        rectangle1.draw();
    }
}

class Shape {
    void draw() { System.out.println("Default drawing function..."); }
}
class Circle extends Shape {
    void draw() { System.out.println("Drawing Circle..."); }
}
class Rectangle extends Shape {
    void draw() { System.out.println("Drawing Rectangle..."); }
}


