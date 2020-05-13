package chapter8.example1b;

import chapter8.example1a.BigCat;

public class Jaguar extends BigCat {
	public Jaguar() {
		size = 10.2;
		name = "Carlos";
//		age = 4;
	}

	public void printDetails() {
		System.out.println(size);
		System.out.println(name);
//		System.out.println(age);
	}
}
