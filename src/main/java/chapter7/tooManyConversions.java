package chapter7;

public class tooManyConversions {
	public static void play(Long l){}
	public static void play(Long... l){}
	
	public static void main(String[] args) {
		//play(4); //can convert to long but can't convert to Long
		play(4L); //runs play with Long.
	}
}
