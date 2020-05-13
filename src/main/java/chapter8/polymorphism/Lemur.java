package chapter8.polymorphism;

class Primate {
	public boolean hasHair() {
		return true;
	}
}
interface HasTail {
	public abstract boolean isTailStriped();
}
public class Lemur extends Primate implements HasTail {
	public boolean isTailStriped() {
		return false;
	}
	public int age = 10;
	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}
//Code prints: 10 false true
//One object is created (Lemur) and reference. Only methods and variables available to that new reference type are 
//callable on the object without an explicit cast. Next snippets won't compile:

//HasTail hasTail = lemur;
//System.out.println(hasTail.age);
//
//Primate primate = lemur;
//System.out.println(primate.isTailStriped());