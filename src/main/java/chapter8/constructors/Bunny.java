package chapter8.constructors;

public class Bunny {
//	public bunny() {}      // bunny with B lowercase, Java thinks it is a regular method but  it is missing the return type

	public void Bunny() {} // regular good method, not a constructor because the return type
}



//Constructor parameter can be any valid class, array, or primitive type, including generic, but may not include var. 
//class Bonobo {
//	public Bonobo(var food) { //Does not compile
//	}
//}



//We can have multiple constructors as long as they have a unique signature, so they must have different parameters. 
//Declaring multiple constructors is referred to as constructor overloading.
//class Turtle {
//	private String name;
//	public Turtle() {
//		name = "John Doe";
//	}
//	public Turtle(int age) {}
//	public Turtle(long age) {}
//	public Turtle(String newName, String... favoriteFoods) {
//		name = newName;
//	}
//}
//Constructors are used when creating an object, that is called instantiation because it creates a new instance of the class. 
//It is called when we do this: new Turtle()
//Java sees the new keyword and it allocates memory for the new object, then it looks for the matching constructor.



//class Rabbit1 {}
//
//class Rabbit2 {
//	public Rabbit2() {}
//}
//
//class Rabbit3 {
//	public Rabbit3(boolean b) {}
//}
//
//class Rabbit4 {
//	private Rabbit4() {}
//}
//Having a private constructor tells the compiler not to create a default one. 
//It prevents other classes from instantiating the class, it is useful when a class has only static methods 
//or the dev wants to have full control of all calls to create new instances of the class.



//A class can have multiple constructors, same name different signature.
//class Hamster {
//	private String color;
//	private int weight;
//	
//	//This is better
////	public Hamster(int weight) {
////		Hamster(weight, "brown"); //Intead of Hamster we use this()
////	}
//	
//	public Hamster(int weight) {
//		this.weight = weight;
//		color = "brown";
//	}
//	public Hamster(int weight, String color) {
//		this.weight = weight;
//		this.color = color;
//	}
//}



//Special considerations:
//this() call must be the first statement in the constructor. So, there can be only one call tho this().
//Hamster(int weight) { 
//	System.out.println("Test");
//	this(weight, "brown");            //does not compile
//}

//You cannot use this() inside a constructor to call itself.
//class Gopher {
//	public Gopher(int dugHoles) { 
//		this(5);	//does not compile
//	}
//}

//You cannot make constructors call each other.
//class Gopher {
//	public Gopher() { 
//		this(5);	//does not compile
//	}
//	public Gopher(int dugHoles) { 
//		this();		//does not compile
//	}
//}


//super()
//class Animal {
//	private int age;
//	public Animal(int age) {
//		super();			//Refers to Object
//		this.age = age;
//	}
//}
//class Zebra extends Animal {
//	public Zebra(int age) {
//		super(age);			//Constructor in Animal
//	}
//	public Zebra() {
//		this(4);			//Constructor in Zebra with int argument
//	}
//}

//Same rules for this() apply for super(), following classes will not compile:
//class Zoo {
//	public Zoo() {
//		System.out.println("Zoo created");
//		super();	//This will not compile because this must go in the first statement of the constructor
//	}
//}

//class Zoo {
//	public Zoo() {
//		super();
//		System.out.println("Zoo created");
//		super();	//This will not compile because it should only be called as the first statement of the constructor
//	}
//}

//If the parent class has more than 1 constructor, the child class may use any valid constructor:
//class Animal {
//	private int age;
//	private String name;
//	public Animal(int age, String name) {
//		super();
//		this.age = age;
//		this.name = name;
//	}
//	public Animal(int age) {
//		super();
//		this.age = age;
//		this.name = null;
//	}
//}
//class Gorilla extends Animal {
//	public Gorilla(int age) {
//		super(age,"Gorilla");
//	}
//	public Gorilla() {
//		super(5);
//	}
//}



//The first line of every constructor is a call to either this() or super(). 
//Java automatically inserts a call to the no-argument constructor super() if you don't explicitly call this() or super() 
//as the first line of a constructor.
//class Donkey {}
//class Donkey2 {
//	public Donkey2() {}
//}
//class Donkey3 {
//	public Donkey3() {
//		super();	//The compiler automatically converts all previous classes to this one
//	}
//}



//A default constructor is inserted by the compiler only if there is no constructor defined in the class.
//class Mammal {
//	public Mammal(int age) {}
//}
//class Elephant extends Mammal {}  //Does not compile

//With no constructors in Elephant, the compiler will try to create a default constructor, 
//and it will auto-insert a call to super() as the first line of the default constructor,  like this:
//class Elephant extends Mammal {
//	public Elephant() {
//		super(10);
//	}
//}

//Since Mammal has already a coded constructor, the compiler will not insert a default one, 
//therefore, the super() call in Elephant will not compile. We can create one constructor to solve this issue:
//class Elephant extends Mammal {
//	public Elephant() {
//		super(10);
//	}
//}
//
//class AfricanElephant extends Elephant {}	//this will work since Elephant does have a no-argument constructor

//Note: super() always refers to the most direct parent.
