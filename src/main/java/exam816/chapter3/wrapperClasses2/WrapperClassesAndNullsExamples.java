package exam816.chapter3.wrapperClasses2;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassesAndNullsExamples {
	Integer pounds = 120;
	Character letter = "robot".charAt(0); //check charAt
	char r = letter;
	
	public static void main(String[] args) {
		var heights = new ArrayList<Integer>();
		heights.add(null);
		//int h = heights.get(0); // NullPointerException WHY????
		
		
		//testWrapper1();
	}
	
	static void testWrapper1(){
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(Integer.valueOf(3));
		numbers.add(Integer.valueOf(5));
//		numbers.remove(1);
//		numbers.remove(Integer.valueOf(5));
		System.out.println(numbers);
	}
	
	
}
