package chapter8.override;

import java.util.ArrayList;
import java.util.List;

//First rule: If two methods have the same name but different signatures, the methods are overloaded, not overridden.
//Overloaded vs Overridden: They both have the same method's name but the overloaded method will use a different list of parameters.
//class Bird {
//	public void fly() {
//		System.out.println("Bird is flying");
//	}
//	public void eat(int food) {
//		System.out.println("Bird is eating " +food+ "units of food");
//	}
//}
//public class Eagle extends Bird {
//	public int fly(int height) {
//		System.out.println("Bird is flying at " +height+ "meters");
//		return height;
//	}
//	public int eat(int food) {//Does not compile
//		System.out.println("Bird is eating " +food+ "units of food");
//		return food;
//	}
//}
//The fly() is overloaded in the class Eagle, the signature changes from no parameters to a int parameter. 
//Because it is an overloaded method, we can change the return type.
//The eat() is overridden in the class Eagle, the signature is the same. Because it is overridden the method, 
//the return type must be compatible with its parent. In this case, the return type int is not a subtype of void, therefore, 
//the compiler throws an exception on the method's definition.



//Second rule: Access modifiers.
//class Camel {
//	public int getNumberOfHumps() {
//		return 1;
//	}
//}
//class BactrianCamel extends Camel {
//	private int getNumberOfHumps() { //Does not compile
//		return 2;
//	}
//}
//public class Rider {
//	public static void main(String[] args) {
//		Camel c = new BactrianCamel();
//		System.out.print(c.getNumberOfHumps());
//	}
//}
//BactrianCamel attempts to override the getNumberOfHumps() but fails because the access modifier private is more restrictive than the one on its father. Java limits overriding a method to access modifiers that are as accessible or more accessible than the parent.



//Third rule: If a broader checked exception is declared in the overriding method, the code will not compile.
//class Reptile {
//	protected void sleepInShell() throws IOException {}
//	protected void hideInShell() throws NumberFormatException {}
//	protected void exitShell() throws FileNotFoundException {}
//}
//class GalapagosTortoise extends Reptile {
//	public void sleepInShell() throws FileNotFoundException {}
//	public void hideInShell() throws IllegalArgumentException {}
//	public void exitShell() throws IOException {}
//}
//These overridden methods are using a more accessible modifier (public), which is ok.
//The sleepInShell() declares FileNotFoundException, which is a subclass of the exception in the parent, IOException. It is ok.
//The hideInShell() declares an IllegalArgumentException, which is a superclass of the exception in the parent, NumberFormatException, 
//however, these are unchecked exceptions, so the third rule does not apply.
//exitShell() declares IOException, which is a superclass of the exception in the parent, FileNotFoundException. 
//These are checked exceptions and IOException is broader, the overridden method does not compile.



//Fourth rule: The overridden method must use a return type that is covariant with the return type of the parent.
//class Rhino {
//	protected CharSequence getName() {
//		return "rhino";
//	}
//	protected String getColor() {
//		return "grey, black, or white";
//	}
//}
//public class JavanRhino extends Rhino {
//	public String getName() {
//		return "javan rhino";
//	}
//	public CharSequence getColor() {	// Does not compile
//		return "grey";
//	}
//}
//String implements CharSequence, so String is a subtype of CharSequence. 
//The return type of getName() in JavanRhino is covariant of the return type of its parent. 
//However, getColor() does not compile, since CharSequence is not a subtype of String.



//Overloading a Generic Method
//You cannot overload methods by changing the generic type. So, it also applies for overloading a generic method in a parent class:
//class LongTailAnimal {
//	protected void chew(List<Object> input) {}
//}
//class Anteater extends LongTailAnimal {
//	protected void chew(List<Double> input) {}    //Does not compile
//}



//Generic Method Parameters
//We can override a method with generic parameters, but you must match the signature including the generic type exactly.
//class LongTailAnimal {
//	protected void chew(List<String> input) {}
//}
//class Anteater extends LongTailAnimal {
//	protected void chew(List<String> input) {} 
//}

//Let's take a look at the following example:
//class LongTailAnimal {
//	protected void chew(List<Object> input) {}
//}
//class Anteater extends LongTailAnimal {
//	protected void chew(ArrayList<Double> input) {} 
//}
//This code compiles. But, they are considered overloaded methods, because the signature is not the same.


//Generic Return Type
//The return values must be covariant. The generic parameter type must match its parent's type exactly.
//class Mammal {
//	public List<CharSequence> play() {
//		return null;
//	}
//
//	public CharSequence sleep() {
//		return null;
//	}
//}
//
//class Monkey extends Mammal {
//	public ArrayList<CharSequence> play() {
//		return null;
//	}
//}
//
//class Goat extends Mammal {
//	public List<String> play() {
//	} // Does not compile
//
//	public String sleep() {
//		return null;
//	}
//}
//The Monkey class is ok because the ArrayList is a subtype of List. For the return types to be covariant, the generic type parameter must match.
		
//Private Methods
//In Java, you cannot override private methods since they are not inherited. 
//class Camel {
//	private String getNumberOfHumps() {
//		return "Undefined";
//	}
//}
//class DromedaryCamel extends Camel {
//	private int getNumberOfHumps() {
//		return 1;
//	}
//}

