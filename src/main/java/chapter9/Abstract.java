package chapter9;

public abstract class Abstract {
}

//abstract class Animal {
//	public static void main(String[] args) {
//		var a = new Animal();
//		System.out.println("test Abstract with Main");
//	}
//}

//Only as Part of the instantiation of a nonabstract SUBCLASS!


abstract class Animal { //not required to have abstract methods, but abstract methods can only be defined in an abstract class
	public Animal(){
		System.out.println("Abstract Constructor can be called only from non abstract subclass");
	}
	
	abstract public String getType();
	public abstract String getAge();
	void getName(){
		System.out.println("SubClass " + getType());
	}
}

class Tiger extends Animal {

//	abstract void testAbstractMethod();
	
	public String getType(){return "Tiger";} //override
	
	public String getAge(){return "5";} //override
	
//	void getName(){
//		System.out.println("SubClass " + getType());
//	}

	
	public static void main(String[] args) {
		Animal a = new Tiger();
		
		a.getName();
		
		//var tiger = new Tiger();
	}
}

abstract class TestClass{
	void tesMethodWithBody(){
		System.out.println("testWithBody");
	}
//	abstract void AbsMethodWithBody(){
//		System.out.println("testWithBody");
//	}
}

//abstract final class AbstractFinalExampleClass{ //Abstract, to be override, final, not letting override
//	abstract final void absFinalEx(){
//		System.out.println("testWithBody");
//	}
//}

//abstract  class Whale{ //Test Private, Static and abstract
//	abstract private void makeNoise();
//    abstract static void swim();
//}
//
//class AnotherWhale extends Whale{
//	private void makeNoise(){
//		System.out.println("make Noise from Another whale");
//	}
//
//	static void swim(){
//      System.out.println("Swim Another whale");
//	}
//}

abstract class Mammal{ //Concrete Classes must implement abstract methods inherited.
	abstract void showHorn();
	abstract void eatLeaf();
}

abstract class Rhino {
	void showHorn(){}
}

class BlackRhino{
	void eatLeaf(){}
}

////////////////////////////////////     Interfaces ///////////////////////////////////
