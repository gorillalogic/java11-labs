package chapter7;

import java.util.List;

public class ReturningValues {
	public static void main(String[] args) {
		int number = 1;
		Integer letters = 123;
		//number(number);
		letters(letters);
		System.out.println( letters);
	}
	
	public static void number(List<String> number){
		number.add("newString");
	}
	public static void letters(Integer letters){
		letters = 1;
	}
}

