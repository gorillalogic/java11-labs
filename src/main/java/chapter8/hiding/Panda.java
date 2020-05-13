package chapter8.hiding;

//class Bear {
//	public static void eat() {
//		System.out.println("Bear is eating");
//	}
//}
//public class Panda extends Bear {
//	public static void eat() {
//		System.out.println("Panda is chewing");
//	}
//	public static void main(String[] args) {
//		eat();
//	}
//}
//The eat() in Panda hides the eat() on Bear, printing "Panda is chewing". They are both static, so this is not overriding. 
//If you remove the eat() in Panda, the this'd print "Bear is eating".


//Let's check the 5th rule:
//class Bear {
//	public static void sneeze() {
//		System.out.println("Bear is sneezing");
//	}
//	public void hibernate() {
//		System.out.println("Bear is hibernating");
//	}
//	public static void laugh() {
//		System.out.println("Bear is laughing");
//	}
//}
//class Panda extends Bear {
//	public void sneeze() {		// Does not compile
//		System.out.println("Panda sneezes quietly");
//	}
//	public static void hibernate() {	// Does not compile
//		System.out.println("Panda is going to sleep");
//	}
//	protected static void laugh() {		// Does not compile
//		System.out.println("Panda is laughing");
//	}
//}
//sneeze() is marked as static in the parent but it is not in the child.
//hibernate() is an instance member in the parent but it is marked as static in the child
//laugh() they are both static methods, the Panda version is more restrictive.


//final Methods
//By marking a method final, you forbid a child from replacing this method. This rule applies for overriding and hiding a method.
//class Bird {
//	public final boolean hasFeathers() {
//		return true;
//	}
//	public final static void flyAway() {}
//}
//class Penguin extends Bird {
//	public final boolean hasFeathers() {	// Does not compile, this cannot be overridden 
//		return false;
//	}
//	public final static void flyAway() {}	// Does not compile, this cannot be hiding
//}
//If the 2 methods were marked private in the Bird class, then the Penguin class, as defined, would compile.


//Hiding Variables
//A hidden variable occurs when a child class defines a variable with the same name as the variable in its parent. 
//You can't override a variable, you can only hide it.
//class Carnivore {
//	protected boolean hasFur = false;
//}
//public class Meerkat extends Carnivore {
//	protected boolean hasFur = true;
//	public static void main(String[] args) {
//		Meerkat m = new Meerkat();
//		Carnivore c = m;
//		System.out.println(m.hasFur);
//		System.out.println(c.hasFur);
//	}
//}
//These prints: true false. 
