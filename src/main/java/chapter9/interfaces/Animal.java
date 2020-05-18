package chapter9.interfaces;

import java.util.List;

public abstract interface Animal{
	public abstract String getName(String name);
	public abstract Float getSpeed(int age);
	public static final String TYPE_NAME = "ANIMAL";
}

//Interfaces have implicit modifiers, modifiers added by the compiler = always abstract

//public final interface finalInterfaceExample{}

interface Climb {
	Number getSpeed(int age);
}

class Mouse implements Animal, Climb {
	public Float getSpeed(int age) {
		return age + 2f;
	}
	
	@Override
	public String getName(String name) {
		return "Mouse";
	}
}

interface MultipleExtends extends Climb, Animal {}

//Declarations
//1. A Java file may have at most one public top-level class or interface and it must match the name of the file
//2. A top-level class or interface can only be declared with public or package-private access


//Implicit Modifiers

// Interfaces are assumed to be abstract
// Interfaces variables are assumed to be public static final
// Interfaces without a body are assumed to be abstract and public

//Conflicting Modifiers

//private final interface Crawl {
//	String distance;
//	private int MAXIMUM_DEPTH = 100;
//	protected abstract boolean UNDERWATER = false;
//	private void dig(int depth);
//	protected abstract double depth();
//	public final void surface();
//}

//Interface vs Abstract class

abstract class Husky{
	abstract void play();
}

interface Poodle{
	void play();
}

//class Webby extends Husky {
//	void play(){}
//}
//
//class Georgette implements Poodle {
//	void play(){}
//}

//Interface Inheritance

//1. Extend another Interface
//2. implement an Interface
//3. Extend a class that implements an Interface

//If the inheriting class is abstract, it doesn't required to implement their methods, but the first concrete will do.

//principle #infinite
// A class can't extend an interface and an interface can't implement another interface


//Duplicate Interface Method Declarations
interface Herbivore {
	public int eatPlants(int quantity);
	CharSequence type();
}

interface Omnivore {
	public void eatPlants();
	String type();
	//int type();
}

class Bear implements Herbivore, Omnivore {
	
	@Override
	public int eatPlants(int quantity) {
		return 0;
	}
	
	@Override
	public void eatPlants() {
	
	}
	
	@Override
	public String type() {
		return "They Just like to Eat!";
	}
	
//	@Override
//	public int type() {
//		return 1;
//	}
}


//Polymorphism
//Cast Interfaces

interface Canine {}

class Dog implements Canine{}
class Wolf implements Canine{}

class CastExample {
	public static void main(String[] args) {
		Canine can = new Wolf();
		//Canine dog = (Dog) can;
		//Object dog = (String) can; //String doen't implements Canine compile fails.
	}
}

//Instance of
class testInstanceOf{
	public static void main(String[] args) {
		//Integer tickets = 4; Integer is final
		Number tickets = 4;
//		if(tickets instanceof String){
//			System.out.println();
//		}
		if(tickets instanceof Canine){
			System.out.println();
		}
		Dog doggy = new Dog();
		
		if (doggy instanceof Canine){
			System.out.println();
		}
	}
	
}

//Review Interface Rules

//1. Interfaces cannot be instantiated
//2. All top-level types, including Interfaces, cannot be marked protected or private
//3. Interfaces are assumed to be abstract and cannot be marked final
//4. Interfaces may include zero or more abstract methods
//5. An interface can extend any number of interfaces
//6. An interface reference may be cast to any reference that inherits the interface, although this may produce an exception at runtime if the classes aren't related
//7. The compiler will only report an unrealted type error for an instanceof operation with an inteface on the right side if the reference on the
//      left side is a final class that soed not inherit the interface
//8. An interface method with a bopdy must be marked default, private, static, or pivate static. (1Z0-816)


// Abstract Interface Method Rules

//1. Abstract methods can be defines only in abstract classes or interfaces
//2. Abstract methods cannot be declared private or final
//3. Abstract methods must not provide a method body/implementation in the abstract class in which is it declared.
//4. Implementing an abstract method in a subclass follows the same rules for overriding a method, incliding covariant return types, exception declarations, etc.
//5. Inteface methods without a body are assumed to be abstract and public.

// Interface Variables Rules

//1. Inteface variabels are assumed to be public, static, final.
//2. Because interface variables are marked final, they must be initialized with a value when they are declared.


//Inner classes
// is a class defined at the member level of a class (methods, instance variables and constructors). it cannot be declared unless it is inside another class.

class Zoo {
	private interface Paper { //inner interface can have all the access modifiers
		public String getId();
	}
	public class Ticket implements Paper{
		private String serialNumber;
		public String getId(){
			return serialNumber;
		}
	}
	
	public Ticket sellTicket(String serialNumber){
		var t = new Ticket();
		t.serialNumber = serialNumber;
		return t;
	}
	
	public static void main(String[] args) {
		var z = new Zoo();
		var t = z.sellTicket("12345");
		System.out.println(t.getId() + " Ticket sold!");
	}
}





