package chapter8.initialization;

//Initialize Instance of X
//1. If there is a superclass Y of X, then initialize the instance of Y first.
//2. Process all instance variable declarations in the order they appear in the class.
//3. Process all instance initializers in the order they appear in the class.
//4. Initialize the constructor including any overloaded constructors referenced with this().

//public class ZooTickets {
//	private String name = "BestZoo";
//	
//	{ System.out.print(name+"-"); }
//	
//	private static int COUNT = 0;
//	
//	static { System.out.print(COUNT+"-"); }
//	
//	static { COUNT = 10; System.out.print(COUNT+"-"); }
//	
//	public ZooTickets() {
//		System.out.print("z-");
//	}
//	public static void main(String... patrons) {
//		new ZooTickets();
//	}
//}
//It prints: 0-10-BestZoo-z-

//Superclass is Object, so, we start with the static components (0- and 10-). 
//Next, we initialize the instance, we start with the instance components (BestZoo-). Finally, we run the constructor (z-).
//Let's see this other:
//
//class Primate {
//	public Primate() {
//		System.out.print("Primate-");
//	}
//}
//class Ape extends Primate {
//	public Ape(int fur) {
//		System.out.print("Ape1-");
//	}
//	public Ape() {
//		System.out.print("Ape2-");
//	}
//}
//public class Chimpanzee extends Ape {
//	public Chimpanzee() {
//		super(2);
//		System.out.print("Chimpanzee-");
//	}
//	public static void main(String[] args) {
//		new Chimpanzee();
//	}
//}
//It prints: Primate-Ape1-Chimpanzee-

//public class CuttleFish {
//	private String name = "swimmy";
//	{
//		System.out.println(name);
//	}
//	private static int COUNT = 0;
//	static {
//		System.out.println(COUNT);
//	}
//	{
//		COUNT++;
//		System.out.println(COUNT);
//	}
//
//	public CuttleFish() {
//		System.out.println("Constructor");
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Ready");
//		new CuttleFish();
//	}
//}

//This prints: 0 Ready swimmy 1 Constructor
//We first process the static variables and initializers. 
//Then, the main() can run, next the instance variable and initializers. Finally, we end with the constructor.
//
//class GiraffeFamily {
//	static {
//		System.out.print("A");
//	}
//	{
//		System.out.print("B");
//	}
//
//	public GiraffeFamily(String name) {
//		this(1);
//		System.out.print("C");
//	}
//
//	public GiraffeFamily() {
//		System.out.print("D");
//	}
//
//	public GiraffeFamily(int stripes) {
//		System.out.print("E");
//	}
//}
//
//public class Okapi extends GiraffeFamily {
//	static {
//		System.out.print("F");
//	}
//
//	public Okapi(int stripes) {
//		super("sugar");
//		System.out.print("G");
//	}
//
//	{
//		System.out.print("H");
//	}
//
//	public static void main(String[] args) {
//		new Okapi(1);
//		System.out.println();
//		new Okapi(2);
//	}
//}
//These prints: 
//AFBECHG
//BECHG
//It starts with the initialization of the classes, since Okapi has a superclass, 
//GiraffeFamily, initialize it first, printing A. Next, initialize Okapi, printing F. 
//Now main() is executed, it creates a new Okapi object, superclass instance GiraffeFamily is initialized first, 
//the instance initializer is called, printing B. Then, constructors are initialized, the String constructor was called, 
//and it has a overloaded constructor, printing now EC. Now, we go to Okapi instanceitself, H is printed. Next, it prints G. Finally, 
//there is another Okapi object created. The process is the same, sans the class initialization. So BECHG is printed.
