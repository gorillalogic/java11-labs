package exam816.chapter3.methodReferences1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Duckling {
	public static void makeSound(String sound) {
		LearnToSpeak learner = s -> System.out.println(s);
		DuckHelper.teacher(sound + " 1st", learner);
		
		LearnToSpeak learner2 = System.out::println;
		DuckHelper.teacher(sound + " 2nd", learner2);
	}
	
	public static void main(String[] args) {
		Duckling.makeSound("test Sound");
	}
	
	
	//There are four formats for method references:
//		Static methods
	{
		Consumer<List<Integer>> lambda = x -> Collections.sort(x);
		Consumer<List<Integer>> methodReference = Collections::sort; //Calling a static method, By Context only 1 parameter
	}
//		Instance methods on a particular instance
	
	{
		var str = "abc";
		Predicate<String> methodRef = str::startsWith;
		Predicate<String> lambda = s -> str.startsWith(s);
		
		var random = new Random();
		Supplier<Integer> methodRef2 = random::nextInt;
		Supplier<Integer> lambda2 = () -> random.nextInt();
	}
	
	//		Instance methods on a parameter to be determined at runtime
	{
		Predicate<String> methodRef1 = String::isBlank;
		Predicate<String> lambda1 = s -> s.isBlank();
		
		BiPredicate<String, String> methodRef = String::startsWith;
		BiPredicate<String, String> lambda = (s, p) -> s.startsWith(p);
		
	}
	
	//		Constructors
	{
		Supplier<List<String>> methodRef = ArrayList::new;
		Supplier<List<String>> lambda = () -> new ArrayList();
		
		Function<Integer, List<String>> methodRef2 = ArrayList::new;
		Function<Integer, List<String>> lambda2 = x -> new ArrayList(x);
		
	}
}




