package chapter8.polymorphism;

//Casting Objects
//Primate primate = new Lemur();    // Implicit Cast
//
//Lemur lemur2 = primate;                // Does not compile
////System.out.println(lemur2.age);
//
//Lemur lemur3 = (Lemur)primate;   // Explicit Cast
//System.out.println(lemur2.age);

//Lemur is a subclass of Primate, this can be done without a cast operator.
//We try to convert the primate reference back to lemur reference, without an explicit cast. The result, the code does not compile.
//In the last one, we explicitly cast the object to a subclass of Primate, and we gain access to all the methods and fields available in Lemur.
//
//You don't need a cast operator if the current reference is a subtype of the target type. If it is not a subtype, 
//you need to perform an explicit cast with a compatible type. If it is not compatible a ClassCastException is thrown at runtime.


//class Bird {}
//class Fish {
//	public static void main(String[] args) {
//		Fish fish = new Fish();
//		Bird bird = (Bird) fish;    // Does not compile
//	}
//}


//Also:
//class Rodent {}
//class Capybara extends Rodent {
//	public static void main(String[] args) {
//		Rodent rodent = new Rodent();
//		Capybara capybara = (Capybara) rodent;    // ClassCastException
//	}
//}
//It throws the exception since the object being referenced is not an instance of the Capybara class.


//instanceof Operator
//We can prevent ClassCastException:
//if(rodent instanceof Capybara) {
//	Capybara capybara = (Capybara) rodent;  
//}
//The compiler does not allow instanceof to be used with unrelated types, check the example with out previous Bird and Fish:
//public static void main(String[] args) {
//	Fish fish = new Fish();
//	if(fish instanceof Bird) {		// Does not compile
//		Bird bird = (Bird) fish;	// Does not compile
//	}
//}


//Polymorphism and Method Overriding
//Polymorphism states that when you override a method, you replace all calls to it, even the ones in the parent.
class Penguin {
	public int getHeight() { return 3;}
	public void printInfo() {
		System.out.print(this.getHeight());
	}
}
public class EmperorPenguin extends Penguin {
	public int getHeight() { return 8;}
	public static void main(String []fish) {
		new EmperorPenguin().printInfo();
	}
}
//It prints 8. The object being operated in memory is EmperorPenguin, and the method getHeight() is overridden, 
//meaning all calls to it are replaced at runtime. If you want to use the getHeight() from the parent, this is one option,
//override printInfo() in EmperorPenguin and use the super:
//public class EmperorPenguin extends Penguin {
//	public void printInfo() {
//		System.out.print(super.getHeight());
//	}
//}


//Overridden vs Hiding Members
//Hiding members is not a form of polymorphism since the methods and variables maintain their individual properties. 
//Hiding members is very sensitive to the reference type and location where the member is being used.
//class Penguin {
//	public static int getHeight() { return 3;}
//	public void printInfo() {
//		System.out.print(this.getHeight());
//	}
//}
//public class EmperorPenguin extends Penguin {
//	public static int getHeight() { return 8;}
//	public static void main(String []fish) {
//		new EmperorPenguin().printInfo();
//	}
//	public void printInfo() {
//		super.printInfo();
//	}
//}
//It prints now 3. 

//Let's check another example:
//class Marsupial {
//	protected int age = 2;
//	public static boolean isBiped() {
//		return false;
//	}
//}
//class Kangaroo extends Marsupial {
//	protected int age = 6;
//	public static boolean isBiped() {
//		return true;
//	}
//	public static void main(String[] args) {
//		Kangaroo joey = new Kangaroo();
//		Marsupial moey = joey;
//		System.out.println(joey.isBiped());
//		System.out.println(moey.isBiped());
//		System.out.println(joey.age);
//		System.out.println(moey.age);
//	}
//}
//It prints: true false 6 2. static methods and variables are hiding not overridden, so Java uses the reference type there.