package chapter7;

class DesignMethods {
	
	
//	public static void main(String[] args) {
//
//	}
	
	/* Method declaration                        Example                                  Required
	1. Access modifier               public/private/default/protected                       No
	2. Optional specifier     final/static/abstract/synchronized/native/strictfp            No
	3. Return type                             void/any value                               Yes
	4. Method name                           any Java method name                           Yes
	5. Parameter list                         parentheses, list of parameters               Yes or ()
	6. Optional exception list              trows then list of exception                    No
	7. method body                                { code }                                  Yes or {}
	 */
	
	//example
	public final void nap(int minutes) throws InterruptedException {
		//method body
	}
	
	
	//1. Access Modifier
	
		/*
		private: access from same class.
		default (Package-Private): access from same package.
		protected: access from same package and subclasses.
		public: access from any class
		 */
	
	//Practice 1
		//public void walk1() {}
		//default void walk2() {}
		//void public walk3() {}
		//void walk3() {}
	
	//2. Optional Specifiers
	
	/*
	static: declare instance access
	abstract: method body not provided
	final: not allowed to be overridden by sub class
	synchronized: used for multithreaded code. not on 1Z0-815.
	native: code written in another language.
	strictfp: making floating-point calculations portable. Not on OCP 11 exams.
	 */
	
	//Practice 2.
	
		//public void walk1() {}
		//public final  void walk2(){}
		//public static final void walk3(){}
		//public final static void walk4(){}
		//public modifier void walk5(){}
		//public void final walk6(){}
		//final public void walk7(){}
	
	//Return Type
	/*
	void: no return type
	any Java type: example  String, Integer, Object, Monkeys(created).
	 */
	
	//Practice 3.
	
		//public void walk1(){}
		//public void walk2(){return:}
		//public String  walk3(){return "";}
		//public String  walk4(){}
		//public walk5(){}
		//public String int walk6(){}
		//String walk7(int a){if (a==4) return "";}
	
	//Method Name: letters, numbers, $ or _
		//Fist character can't be a number
		//Can't use reserved words
		//single _ not allowed
	
	//Practice 4.
	
		//	public void walk1(){}
		//	public void 2walk(){}
		//	public walk3 void(){}
		//	public void walk4_$(){}
		//	public _(){}
		//	public void(){}
	
	//Parameter List
		// 0 or n parameters in ()
		void  nap(){}
	
	//Practice 5
		//	public void walk1(){}
		//	public void walk2 {}
		//	public void walk3(int a){}
		//	public void walk4(int a; int b){}
		//	public void walk5(int a, int b){}
	
	//Optional Exception List (Optional) more details on chap 10.
		//Separated by commas all that can be present.
	//Practice 6
		// public void zeroExceptions() {}
		// public void oneExceptions() throws IllegalArgumentException {}
		// public void 2Exceptions()  throws IllegalArgumentException, InterruptedException {}
		// public void twoExceptions() IllegalArgumentException, InterruptedException {}
	
	//Method Body
		//A code block
	
	//Practice 7
		//	public void walk1() {}
		//	public void walk2()
		//	public void walk3(int a) {int name = 5;}
	
	//Working With Varargs
		//Last element of parameter list, no more than one.
	
	//Practice 8 and 9
		//	public void walk1(int... nums){}
		//	public void walk2(int stat, int... nums){}
		//	public void walk3(int... nums, int start){}
		//	public void walk4(int... nums, int... starts){}
	
		/*	public static void walk(int start, int... nums){
					System.out.println(nums.length);
			}

			public static void main(String[] args){
					walk(1);
					walk(1,2);
					walk(1, 2, 3);
					walk(1, new int[] {4, 5});
					//walk(1, null)
			}*/
		
		//Example of Varargs access
				/*public static void run(int... nums){
						System.out.println(nums[1]);
				}

				public static void main(String[] args){
						run(11, 22);
				}*/
	
	//Applying Access Modifiers
	
		//private: access from same class. -> FatherDuck and BadDuckling
	
		
		//default (Package-Private): access from same package.
		//MotherDuck, GoodDuck and BadCygnet
		
		
		//protected: access from same package and subclasses.
		//Bird, Gosling, BirdWatcher, BirdWatcherFromAfar
		//extra Swan
	
		//public: access from any class
	
	
	//Applying static keyword
		//1. For Utility or helper methods that don't require any  object state.
		//2. State that is shared by all instances of a class, like a counter.
		// Methods that merely use that state should be static as well.
		//3. Main method
	//Designing static methods and fields
	//Accessing a  static Variable  or Method
	
		/*class Koala {
			public static int count = 0;  //Static Variable
			public static void main(String[] args){ //Static method
				System.out.println(count);
			}
		}
		 */
		
	//Practice 10
		//Koala.count = 4;
		//Koala koala1 = new Koala();
		//Koala koala2 = new Koala();
		//Koala.count = 6;
		//Koala.count = 5;
		//System.out.println(Koala.count);
	
	//Static vs Instance
		//Static members can't call an instance member without
		// referencing and instance of the class
	
	//Example class Gorilla
	
	//static variables and static initialization
		//private static int counter =0; //Initialization
		//private static final int NUM_BUCKETS = 45;
		//	public static void main(String[] args) {
		//		NUM_BUCKETS = 5;    // does not compile
		//	}
	
	//static initialization
		//      private static final int NUM_SECONDS_PER_MINUTE;
		//      private static final int NUM_MINUTES_PER_HOUR;
		//      private static final int NUM_SECONDS_PER_HOUR;
		//		static {
		//			NUM_SECONDS_PER_MINUTE = 60;
		//			NUM_MINUTES_PER_HOUR = 60;
		//		}
		//      static {
		//          NUM_SECONDS_PER_HOUR =
		//          NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR
		//      }
	
		//Note: since the assignment is at the instance of the class its ok to change finals.
	
		//Practice 11
	
		/*private static int one;
		private static final int two;
		private static final int three = 3;
		private static final int four;
		
		static {
			one = 1;
			two = 2;
			three = 3;
			two = 4;
		}*/
		
	//Static Imports
		//Access static members of other class
		//import static java.util.Arrays.asList
		//List list = asList("one", "two",); no Arrays.
	
	//Practice 12
		/*
		import static java.util.Arrays
		import static java.util.Arrays.asList
		static import java.util.Arrays.*
		*/
		
		//import static statics.A.TYPE
		//import static statics.B.TYPE
	
	//Passing Data among Methods
	//pass-by-value vs pass-by-reference (not in JAVA)
	
	//Example:
		/*public static void main(String[] args){
			int num = 4;
			newNumber(num);
			System.out.println(num);
		}
		public static void newNumber(int num){
			num = 8;
		}*/
	
	//line 251: main.num = ObjectA(4);
	//line 256: newNumber.num = ObjectA(4) -> = ObjectB(8);
	//Objects created 2, A and B
	
	//Practice 13 ReturningValues
	
	//Overloading Methods
		//Occurs when methods have same name  bit different method Signatures(Parameters).
		//Java looks for the most specific method parameter types.
	
	//Practice 14
		//	public void fly(int numMiles){}
		//	public int fly(int numMiles){}
		//	public static void fly(int numMiles){}
	
	//varargs on overloading
		//Java treats varargs as they where an array.
		//public void fly(int[] length)
		//public void fly(int... length) //Does not compile
	
	//Autoboxing on overloading
		//fly(3)
		//public void fly(int numMiles{}
		//public void fly(Integer numMiles{}
	
	//Reference types on overloading
		/*public void fly(Object o){ System.out.println("Object");}
		public void fly(String s){ System.out.println("String");}
		public static void main(String[] args) {
			DesignMethods designMethods = new DesignMethods();
			designMethods.fly("Test");
			designMethods.fly(123);
		}*/
	
	//Generics
		//not valid overloads since the generics are used at compile time.
		//Example:
		// public void walk(List<String> strings){}
		// public void walk(List<Integers> integers){}
		//equals to
		// public void walk(List strings){}
		// public void walk(List integers){} //Does not compile
	//Arrays
		//Example
		//public static void walk(Integer[] ints) {}
		//public static void walk(Integer[] integers) {}
	
	//Practice 15 too many conversion class
	
	//Encapsulating Data
		//Example:
		/*public class Swan {
		  int numberEggs; //instance variable (package-private)
		 }
		 mother.numberEggs = -1;*/
	
	//usage of getter and setters
		/*public class Swan{
			private int numberEggs;
			public int getNumberEggs(){
				return numberEggs;
			}
			public void setNumberEggs(int newNumber){
				if(newNumber > 0){
					numberEggs = newNumber;
				}
			}
		}*/
	
	
	//naming convention for getters and setters
	//Getter: if boolean use prefix "is", else use "get"
	//Setter: use prefix "set".
	
	//Summary
	
	
}