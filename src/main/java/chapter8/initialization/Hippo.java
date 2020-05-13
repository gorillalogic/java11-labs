package chapter8.initialization;

//Initialize Class X
//1. If there is a superclass Y of X, then initialize class Y first.
//2. Process all static variable declarations in the order they appear in the class.
//3. Process all static initializers in the order they appear in the class.

//class Animal {
//	static { System.out.print("A"); }
//}
//public class Hippo extends Animal {
//	static { System.out.print("B"); }
//	public static void main(String[] args) {
//		System.out.print("C");
//		new Hippo();
//		new Hippo();
//		new Hippo();
//	}
//}

//It prints ABC exactly once.
//Since the main() is inside Hippo, the class will be initialized first, starting with the superclass. 
//Afterward, the main() is executed. Check following example:

//public class HippoFriend {
//	public static void main(String[] grass) {
//		System.out.print("C");
//		new Hippo();
//	}
//}
//It prints now CAB, because the Hippo class is not loaded until is needed inside the main() method.
//Note: The class containing the program entry point (main()) is loaded before the main() method is executed.

